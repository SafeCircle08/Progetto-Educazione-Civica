package Rooms;

import javax.swing.*;

public class RoomsDefines {

    static private final int DEFAULT_W_WIDTH = 1240;
    static private final int DEFAULT_H_WIDTH = 860;


    static Room entrance = new RoomEntrance(
            "Entrance",
            DEFAULT_W_WIDTH, DEFAULT_H_WIDTH,
            new ImageIcon(RoomEntrance.class.getResource("/Assets/sprRmFirstFloor.png")));

    static Room groundFloor = new RoomGroundFloor(
            "Ground Floor",
            DEFAULT_W_WIDTH, DEFAULT_H_WIDTH,
            new ImageIcon(RoomGroundFloor.class.getResource("/Assets/sprRmGroundFloor.png")));

    static Room firstFloor = new RoomFirstFloor(
            "First Floor",
            DEFAULT_W_WIDTH, DEFAULT_H_WIDTH,
            new ImageIcon(RoomFirstFloor.class.getResource("/Assets/sprRmFirstFloor.png")));
}