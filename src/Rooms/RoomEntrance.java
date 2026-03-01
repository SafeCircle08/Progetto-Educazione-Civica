package Rooms;

import javax.swing.*;

public class RoomEntrance extends Room {

    public RoomEntrance(String _title, int _w, int _h, ImageIcon icon) {
        super(_title, _w, _h, icon);

        JButton porta = new JButton("ciao");
        porta.setBounds(20, 20, 500, 30);
        porta.addActionListener( e-> { changeRoom(RoomsDefines.groundFloor); });
        panel.add(porta);
    }
}