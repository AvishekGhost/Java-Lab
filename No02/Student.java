public class Student{

    String Name;
    float Marks[] = new float[3];

    Student(){
        this.Name = "No Name";
        for(int i = 0;i<3;i++){
            this.Marks[i] = 0;
        }
    }

    Student(String Name, float []Marks){
        this.Name = Name;
        for(int i = 0;i<3;i++){
            this.Marks[i] = Marks[i];
        }
    }

    public float Average(){
        float sum = 0;
        for(int i = 0;i<3;i++){
            sum += this.Marks[i];
        }
        return sum/3;
    }

    public void Display(){
        System.out.println("Name : " + Name);
        System.out.print("Maths : " + Marks[0]);
        System.out.print("\tPhy : " + Marks[1]);
        System.out.println("\tChem : " + Marks[2]);
        System.out.println("Avarage = " + Average());
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("GGez");
    
        float []marks = {33,98,85};
    
        Student student = new Student();
        Student student1 = new Student("arnab", marks);
        student.Display();
        student1.Display();
        
    }

    
}
