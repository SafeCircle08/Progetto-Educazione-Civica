package Rooms;

import javax.swing.*;

public class RoomsDefines {

    static private final int DEFAULT_W_WIDTH = 1280;
    static private final int DEFAULT_W_HEIGHT = 720;

    static Room menu = new Menu(
            "Menu",
            DEFAULT_W_WIDTH, DEFAULT_W_HEIGHT,
            new ImageIcon(Menu.class.getResource("/Assets/background.png")));

    public static Room getMenuRoom() { return menu; }
}