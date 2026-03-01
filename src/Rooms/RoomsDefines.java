package Rooms;

import javax.swing.*;

public class RoomsDefines {

    static private final int DEFAULT_W_WIDTH = 1290;
    static private final int DEFAULT_W_HEIGHT = 757;

    static Room menu = new Menu(
            "Menu",
            DEFAULT_W_WIDTH, DEFAULT_W_HEIGHT,
            new ImageIcon(Menu.class.getResource("/Assets/menuBackGround.png")));

    static Room piantinaPianoTerra = new RoomGroundFloor(
            "Piantina Piano Terra",
            DEFAULT_W_WIDTH, DEFAULT_W_HEIGHT,
            new ImageIcon(RoomGroundFloor.class.getResource("/Assets/gui_1.png")));

    static Room firstFloor = new RoomFirstFloor(
            "First Floor",
            DEFAULT_W_WIDTH, DEFAULT_W_HEIGHT,
            new ImageIcon(RoomFirstFloor.class.getResource("/Assets/menuBackGround.png")));

    public static Room getMenuRoom() { return menu; }
    public static Room getGroundFloor() { return piantinaPianoTerra; }
    public static Room getFirstFloor() { return firstFloor; }

}