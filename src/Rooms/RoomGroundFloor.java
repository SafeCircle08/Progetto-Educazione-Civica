package Rooms;

import javax.swing.*;

public class RoomGroundFloor extends Room {

    public RoomGroundFloor(String _title, int _w, int _h, ImageIcon icon) {
        super(_title, _w, _h, icon);

        JButton porta = new JButton("Vai al primo piano");
        porta.setBounds(20, 20, 500, 30);
        porta.addActionListener(e -> { changeRoom(RoomsDefines.firstFloor); });
        panel.add(porta);
    }
}