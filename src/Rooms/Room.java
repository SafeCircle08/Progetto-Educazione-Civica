package Rooms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Room extends JFrame {
    protected String title;
    protected int WINDOW_W;
    protected int WINDOW_H;
    protected JPanel panel;
    protected ImageIcon roomIcon;
    protected JLabel roomIconLabel;

    public Room(String _title, int _w, int _h, ImageIcon _roomIcon) {
        initWindow(_title,_w,_h);
        initPanel(_w, _h, _roomIcon);
    }

    protected String getRoomTitle() { return this.title; }
    protected int getRoomW() { return this.WINDOW_W; }
    protected int getRoomH() { return this.WINDOW_H; }
    protected JPanel getPanel() { return this.panel; }

    private void initWindow(String _title, int _w, int _h){
        this.title = _title;
        this.WINDOW_W = _w;
        this.WINDOW_H = _h;
        setTitle(_title);
        setSize(_w, _h);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        setVisible(false);
    }

    private void initPanel(int _w, int _h, ImageIcon _roomIcon) {
        panel = new JPanel();
        initRoomIcon(_roomIcon);
        panel.setLayout(null);
        panel.setBounds(0, 0, _w, _h);
        panel.setVisible(true);
        add(panel);
    }

    private Image resizeRoomIcon(ImageIcon _roomIcon) {
        int w = getContentPane().getWidth();
        int h = getContentPane().getHeight();
        return _roomIcon.getImage().getScaledInstance(WINDOW_W, WINDOW_H, Image.SCALE_SMOOTH);
    }

    private void initRoomIcon(ImageIcon _roomIcon) {
        roomIcon = _roomIcon;
        ImageIcon resizedIcon = new ImageIcon(resizeRoomIcon(roomIcon));

        roomIconLabel = new JLabel(resizedIcon);
        roomIconLabel.setBounds(-10, -20, getRoomW(), getRoomH());
        panel.add(roomIconLabel);
    }

    protected void changeRoom(Room newRoom) {
        newRoom.setVisible(true);
        dispose();
    }

    protected void setLabelFontColor(JLabel label, Color color, String fName, int fontType, int size) {
        label.setForeground(color);
        label.setFont(new Font(fName, fontType, size));
    }

    protected JButton createButton(String btnTxt, ImageIcon icon,  int x, int y, ActionListener e) {

        JLabel label = new JLabel(btnTxt);
        setLabelFontColor(label, Color.WHITE, "Arial", Font.TRUETYPE_FONT, 20);

        JButton btn = new JButton(icon);

        btn.setBorderPainted(false);
        btn.setFocusPainted(false);
        btn.setContentAreaFilled(false);

        btn.setBounds(x, y, icon.getIconWidth(), icon.getIconHeight());
        label.setBounds(x + 20, y, icon.getIconWidth(), icon.getIconHeight());
        btn.addActionListener(e);

        btn.setVisible(true);
        panel.add(btn);
        panel.add(label);
        panel.setComponentZOrder(btn, 0);
        panel.setComponentZOrder(label, 0);
        return btn;
    }

    protected JButton createLinkButton(Room destination, int x, int y, int w, int h) {
        JButton linkButton = new JButton("Questo è un collegamento");
        linkButton.setBounds(x, y, w, h);

        linkButton.addActionListener(e -> { changeRoom(destination); });
        panel.add(linkButton);
        return linkButton;
    }
}