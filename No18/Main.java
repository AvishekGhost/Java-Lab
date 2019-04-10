interface Fruit{
 	void hasAPeel();
 }

 interface Vegetable{
 	void hasARoot();
 }

 class Tomato implements Fruit, Vegetable{
 	public void hasARoot(){
 		System.out.println("Has a root");
 	}

 	public void hasAPeel(){
 		System.out.println("Has A Peel");
 	}
 }

 public class Main{
 	public static void main(String [] args){
 		Tomato tomato  = new Tomato();
 		tomato.hasAPeel();
 		tomato.hasARoot();
 	}
 }
