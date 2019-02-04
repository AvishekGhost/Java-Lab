class Automobile{
 	private String make;
 	private String type;
 	private float maxSpeed;
 	private float price;
 	private float milage;
 	private int registrationNumber;

 	public Automobile(String make, String type, float maxSpeed, float price, float milage, int registrationNumber){
 		this.make = make;
 		this.type = type;
 		this.maxSpeed = maxSpeed;
 		this.price = price;
 		this.milage = milage;
 		this.registrationNumber = registrationNumber;
 	}
 	
 	void Display(){
 	    System.out.print(make +"\t" + type+"\t" + maxSpeed +"km/h\t" + price +"Rs\t" + milage +"km/l\t" + registrationNumber);
 	}
 }
 
 class Truck extends Automobile{
    private int capacity;
    private String hoodType;
    private int noOfWheels;
    
    public Truck(String make, float maxSpeed, float price, float milage, int registrationNumber,int capacity, String hoodType, int noOfWheels){
        super(make,"Truck",maxSpeed,price,milage,registrationNumber);
        this.capacity = capacity;
        this.hoodType = hoodType;
        this.noOfWheels = noOfWheels;
    }
    
    @Override
    void Display(){
        System.out.println("Make\tType\tMaxSpeed\tPrice\t\tMilage\t\tRegNo\tCapacity\tHood\tWheels");
        super.Display();
        System.out.print("\t"+ capacity+"kg\t\t"+hoodType+"\t"+noOfWheels+"\n");
    }
 }
 
class Car extends Automobile{
    private int noOfDoors;
    private int seatingCapacity;
    
    public Car(String make, float maxSpeed, float price, float milage, int registrationNumber, int noOfDoors, int seatingCapacity){
        super(make,"Car",maxSpeed,price,milage,registrationNumber);
        this.noOfDoors = noOfDoors;
        this.seatingCapacity = seatingCapacity;
    }
    @Override
    void Display(){
        System.out.println("Make\tType\tMaxSpeed\tPrice\t\tMilage\t\tRegNo\tDoor\tSeats");
        super.Display();
        System.out.print("\t"+ noOfDoors +"\t"+ seatingCapacity +"\n");
    }
}
 
 public class Main{
    public static void main (String[] args) {
        Car car = new Car(RandomString(), (float)(Math.random()*1000), (float)(Math.random()*1000000), (float)(Math.random()*1000),(int)(Math.random()*10000),4, (int)(Math.random()*12));
        Truck truck = new Truck(RandomString(), (float)(Math.random()*1000), (float)(Math.random()*1000000), (float)(Math.random()*1000),(int)(Math.random()*10000),(int)(Math.random()*10),RandomString(),(int)(Math.random()*10));
        car.Display();
        truck.Display();
    }
     protected static String RandomString() {
    String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    StringBuilder salt = new StringBuilder();
    while (salt.length() < 5) {
        int index = (int) ((float)Math.random() * SALTCHARS.length());
        salt.append(SALTCHARS.charAt(index));
    }
    String saltStr = salt.toString();
    return saltStr;
    }

 }
 
