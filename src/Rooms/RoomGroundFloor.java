package Rooms;

import javax.swing.*;

public class RoomGroundFloor extends Room {

    public RoomGroundFloor(String _title, int _w, int _h, ImageIcon icon) {
        super(_title, _w, _h, icon);
        JButton porta = createLinkButton(RoomsDefines.getEntrance(), 5, 20, 200, 600);
    }
}