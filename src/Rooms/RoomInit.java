package Rooms;

import javax.swing.*;

public class RoomInit{

    public static void main(String[] args){

        Room initRoom = new Room("Init", 500, 500, new ImageIcon("/Assets/sprRmFirstFloor.png"));
        initRoom.changeRoom(initRoom);
        initRoom.changeRoom(RoomsDefines.getGroundFloor());
    }
}