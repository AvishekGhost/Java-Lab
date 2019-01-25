public class Main{

    public static void main(String[] args) {
        System.out.println("GGez");
        Room room = new Room(2, 2, 2);
        System.out.println("Volume of the room = " + room.Volume());
        RoomDemo roomDemo = new RoomDemo(3,3,3);
        System.out.println("Volume of the room = " + roomDemo.Volume());
    }
}
