
public class Main {

    public static void main(String[] args) {
        Book []book = new Book[5];
        Library lib = new Library();
        for(int i = 0;i<5;i++){
            int no = (int)( Math.random()*10);
            if(no == 0) 
                 no = 1;
            String [] auth = new String[no];
            for(int k =0; k<no;k++){
                auth[k] = getSaltString();
            }

            book[i] = new Book(getSaltString() ,auth ,(int)( Math.random()*10000),(float)(Math.random()*1000),getSaltString());
            lib.Add(book[i]);
        }

        System.out.println("Title\tAuthor\tPages\tPublisher\tPrice");
        System.out.println("===================================================");
        for(int i = 0;i<5;i++){
            book[i].Display();
        }
        System.out.println("Total price = "+ lib.TotalPrice());
    }

    protected static String getSaltString() {
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
