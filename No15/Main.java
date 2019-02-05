class Global{
    static double PI = 3.14;
}

interface Shape{
    double area();
    void move();
    void draw();
    void rotate();
}

class Circle implements Shape{
    private String type = "Circle";
    private float rad;
    
    Circle(float rad){
        this.rad = rad;
    }
    
    @Override
    public double area(){
        return Global.PI*r*r;
    }
    @Override
    public void move(){
        System.out.println("Circle Moved");
    }
    @Override
    public void draw(){
        System.out.println("Circle Drawn");
    }
    @Override 
    public void rotate(){
        System.out.println("Circle Rotated");
    }
    
}

class Rectangle implements Shape{
    private float height;
    private float width;
    
    Rectangle(float height , float width){
        this.height = height;
        this.width = width;
    }
    
    @Override
    public double area(){
        return (2*(height+width));
    }
    @Override
    public void draw(){
        System.out.println("Rectangle Drawn");
    }
    @Override 
    public void rotate(){
        System.out.println("Rectangle Rotated");
    }
    @Override
    public void move(){
        System.out.println("Rectangle Moved");
    }
}

public class Main{
    public static void main (String[] args) {
        Circle c = new Circle(10);
        
        Rectangle r = new Rectangle(2,2);
        
        System.out.println(r.area());
        r.draw();
        r.rotate();
        r.move();
       
        System.out.println(c.area());
        c.draw();
        c.rotate();
        c.move();
    }
}
