
public class Main {

    public static void main(String[] args) {
        int NumberOfEmp = 5;
        Employee []e = new Employee[NumberOfEmp];
        Dept d = new Dept();
        for (int i = 0; i < NumberOfEmp; i++) {
            e[i] = new Employee(RandomString(),(int)(Math.random()*10000));
            d.Add(e[i]);
        }
        System.out.println("name\tSalary\tid");
        System.out.println("================================");
        for (int i = 0; i < NumberOfEmp; i++) {
            e[i].Display();
        }
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
