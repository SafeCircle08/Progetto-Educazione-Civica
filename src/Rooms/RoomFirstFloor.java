package Rooms;

import javax.swing.*;

public class RoomFirstFloor extends Room {
    public RoomFirstFloor(String _title, int _w, int _h, ImageIcon icon) {
        super(_title, _w, _h, icon);

        JButton porta = new JButton("vai al piano terra");
        porta.setBounds(20, 20, 500, 30);
        porta.addActionListener( e-> { changeRoom(RoomsDefines.groundFloor); });
        panel.add(porta);
    }
}
