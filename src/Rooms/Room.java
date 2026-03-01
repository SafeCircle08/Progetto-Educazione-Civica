package Rooms;

import javax.swing.*;
import java.awt.*;

public class Room extends JFrame {
    protected String title;
    protected int WINDOW_W;
    protected int WINDOW_H;
    protected JPanel panel;
    protected ImageIcon roomIcon;
    protected JLabel roomIconLabel;

    public Room(String _title, int _w, int _h, ImageIcon _roomIcon) {
        initWindow(_title,_w,_h);
        initPanel(_w, _h);
        initRoomIcon(_roomIcon);
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
        setLayout(null);
        setVisible(false);
    }
    private void initPanel(int _w, int _h) {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, _w, _h);
        panel.setVisible(true);
        add(panel);
    }

    private Image resizeRoomIcon(ImageIcon _roomIcon) {
        return _roomIcon.getImage().getScaledInstance(WINDOW_W, WINDOW_H, Image.SCALE_SMOOTH);
    }
    private void initRoomIcon(ImageIcon _roomIcon) {
        if (_roomIcon == null || _roomIcon.getIconWidth() == -1) {
            System.out.println("❌ Immagine NON caricata");
        } else {
            System.out.println("✅ Immagine caricata");
        }
        roomIcon = _roomIcon;
        ImageIcon resizedIcon = new ImageIcon(resizeRoomIcon(roomIcon));

        roomIconLabel = new JLabel(resizedIcon);
        roomIconLabel.setBounds(0, 0, getRoomW(), getRoomH());
        panel.add(roomIconLabel);
    }
    protected void changeRoom(Room newRoom) {
        newRoom.setVisible(true);
        dispose();
    }

    protected JButton createLinkButton(Room destination, int x, int y, int w, int h) {
        JButton linkButton = new JButton("Questo è un collegamento");
        linkButton.setBounds(x, y, w, h);

        linkButton.addActionListener(e -> { changeRoom(destination); });
        panel.add(linkButton);
        return linkButton;
    }
}