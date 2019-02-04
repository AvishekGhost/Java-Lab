/*Implement the classes for the following inheritance hierarchies.
Create an interface “Shape” that contains methods ‘area’, ‘draw’, ‘rotate’, ‘move’ etc. Now create two classes “Circle” and “Rectangle”
that implement this ‘Shape’ interface and implement the methods ‘area’, ‘move’, etc. Write a main() function to create two “Circle” and 
three “Rectangle”,then move them. Print the details of circles and rectangles before after moving them.*/

class Global{
    static double PI = 3.14;
}

interface Shape{
    double area();
  
}

class Circle implements Shape{
    String type = "Circle";
    
    private float rad;
    
    Circle(float rad){
        this.rad = rad;
    }
    
    @Override
    public double area(){
        return Global.PI;
    }
}

public class Main{
    public static void main (String[] args) {
        Circle c = new Circle(10);
        System.out.println(c.area());
        
    }
}
