public class RoomDemo extends Room{

    RoomDemo(double Height, double Width, double Breadth){
        super(Height,Width,Breadth);
    }
    // or
    @Override
    public double Volume(){
        return super.Volume();
    }

}
