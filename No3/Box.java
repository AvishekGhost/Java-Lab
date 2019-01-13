public class Box{
    private double Height; 
    private double Width; 
    private double Breadth; 

    public Box(){
        Height = 0;
        Width = 0;
        Breadth = 0;
    }

    public Box(double Height, double Width, double Breadth){
        this.Height = Height;
        this.Width = Width;
        this.Breadth = Breadth;
    }

    public double getVolume(){
        return (Height * Width * Breadth);
    }

    public double getArea(){
        return (2*((Breadth * Width) + (Width * Height) + (Height * Breadth))); 
    }

    public static void main(String[] args) {
        System.out.println("GGez");

        Box box = new Box(2, 2, 2);
        System.out.println("Volume of the Box = " + box.getVolume());
        System.out.println("Area of the Box = " + box.getArea() + "\n");

        Box box1 = new Box(3,3,3);
        System.out.println("Volume of the Box = " + box1.getVolume());
        System.out.println("Area of the Box = " + box1.getArea());
    }
}
