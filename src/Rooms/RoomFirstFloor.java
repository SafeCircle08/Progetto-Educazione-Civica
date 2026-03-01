package Rooms;

import javax.swing.*;

public class RoomFirstFloor extends Room {
    public RoomFirstFloor(String _title, int _w, int _h, ImageIcon icon) {
        super(_title, _w, _h, icon);
        JButton porta = createLinkButton(RoomsDefines.getGroundFloor(), 20, 20, 500, 500);
    }
}
