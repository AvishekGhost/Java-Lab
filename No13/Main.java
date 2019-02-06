import java.util.Arrays;

class Person{
    private int age;
    private float weight;
    private float height;
    private String dateOfBirth;
    private String address;
    private String type;

    public Person(int age, float weight, float height, String dateOfBirth, String address, String type) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +", ";
    }
}

class Employee extends Person{
    private float salary;
    private String dateOfJoining;

    @Override
    public String toString() {
        return
                super.toString()+
                "salary=" + salary +
                ", dateOfJoining='" + dateOfJoining + '\'' ;
    }

    Employee(int age, float weight, float height, String dateOfBirth, String address, String type, float salary, String dateOfJoining){
        super(age, weight, height, dateOfBirth, address, "Employee");
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }
}

class Student extends Person{
    private int roll;
    private static int noOfStudents;
    private String [] listOfSubjects = {"MATH","PHY","CHEM"};
    private int [] marks = new int[3];

    static{
        noOfStudents = 0;
    }

    Student(int age, float weight, float height, String dateOfBirth, String address, int [] marks){
        super(age, weight, height, dateOfBirth, address, "Student");
        this.noOfStudents++;
        roll = noOfStudents;
        for (int i = 0; i < 3; i++) {
            this.marks[i] = marks[i];
        }
    }

    @Override
    public String toString() {
        return "Student\n" +
                super.toString()+
                "roll=" + roll +
                ", listOfSubjects=" + Arrays.toString(listOfSubjects) +
                ", marks=" + Arrays.toString(marks) ;
    }

    public String calculateGrade(){
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += this.marks[i];
        }
        sum = sum/3;
        if(sum < 100 && sum > 90)
            return "S";
        else if(sum < 90 && sum > 80)
            return "A";
        else if(sum < 80 && sum > 70)
            return "B";
        else if(sum < 70 && sum > 60)
            return "C";
        else if (sum < 60 && sum > 50)
            return "D";
        else if(sum < 50 && sum > 40)
            return "E";
        else
            return "X";
    }
}

class Technician extends Employee{
    public Technician(int age, float weight, float height, String dateOfBirth, String address, float salary, String dateOfJoining) {
        super(age, weight, height, dateOfBirth, address,"Technician", salary, dateOfJoining);
    }

    @Override
    public String toString() {
        return "Technician\n"+
                super.toString();
    }
}

class Professor extends Employee{
    private String [] courses = new String[2];
    private String []listOfAdvisee = new String[2];
    private int listOfAdviseeIndex;
    private int coursesIndex;

    public Professor(int age, float weight, float height, String dateOfBirth, String address, float salary, String dateOfJoining, String [] courses, String [] listOfAdvisee ) {
        super(age, weight, height, dateOfBirth, address, "Professor", salary, dateOfJoining);
        for(int i=0;i<courses.length;i++)
            this.courses[i] = courses[i];
        for (int i = 0; i < listOfAdvisee.length; i++)
            this.listOfAdvisee[i] = listOfAdvisee[i];
        this.listOfAdviseeIndex = listOfAdvisee.length;
        this.coursesIndex = courses.length;
    }
    public void addCourses(String src){
        this.coursesIndex++;
        this.courses[coursesIndex] = src;
    }

    @Override
    public String toString() {
        return "Professor\n" +
                super.toString()+
                "courses=" + Arrays.toString(courses) +
                ", listOfAdvisee=" + Arrays.toString(listOfAdvisee) ;
    }

    public void addListOfAdvisee(String src){
        this.listOfAdviseeIndex++;
        this.listOfAdvisee[listOfAdviseeIndex] = src;
    }
}

public class Main {

    public static void main(String[] args) {
        Person person = new Person(20,85,(float) 6.0,"13/10/1998","9/89 XYZ street","Person");
        Employee employee = new Employee(35,86,(float)5.6,"5/6/1991","8/8 XYZ colony","Employee",36000,"12/5/20010");
        Student student = new Student(20,85,(float) 6.0,"13/10/1998","9/89 XYZ street", new int[]{78, 99, 87});
        Technician technician = new Technician(35,86,(float)5.6,"5/6/1991","8/8 XYZ colony",36000,"12/5/20010");
        Professor professor = new Professor(56,81,(float)5.9,"6/6/1989","8/8 XYZ",80000,"16/8/1999",new String[]{"MATH","PHY"},new String[]{"advice 1","advice 2"});

        System.out.println("Person\n" + person.toString());
        System.out.println("Employee\n" + employee.toString());
        System.out.println(student.toString());
        System.out.println(technician.toString());
        System.out.println(professor.toString());
    }

}
