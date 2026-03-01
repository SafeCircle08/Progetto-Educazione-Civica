package Rooms;

import javax.swing.*;

public class Menu extends Room {

    public Menu(String _title, int _w, int _h, ImageIcon icon) {
        super(_title, _w, _h, icon);

        JButton porta = new JButton("ciao");
        porta.setBounds(5, 20, 100, 100);
        porta.addActionListener( e-> { changeRoom(RoomsDefines.getGroundFloor()); });
        panel.add(porta);
    }
}