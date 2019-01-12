public class Room{
    private double Height; 
    private double Width;
    private double Breadth;

    public Room(){
        Height = 0;
        Width = 0;
        Breadth = 0;
    }

    public Room(double Height, double Width, double Breadth){
        this.Height = Height;
        this.Width = Width;
        this.Breadth = Breadth;
    }
    public double Volume(){
        return (Height * Width * Breadth);
    }
}