public class Employee {
    private String name;
    private static int NumberOfEmployees;
    private int id;
    private int salary;
    private String address;

    static {
        NumberOfEmployees = 0;
    }

    public Employee(String name, int salary) {
        this.NumberOfEmployees++;
        this.name = name;
        this.salary = salary;
        this.id = NumberOfEmployees;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }
    public void Display(){
        System.out.println(name + "\t" + salary +"\t" + id);
    }
}
