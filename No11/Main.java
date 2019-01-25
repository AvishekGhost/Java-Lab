public class Main {
    public static void main(String[] args) {
        Book []book = new Book[3];
        Journal []journal = new Journal[2];
        Library library = new Library(5);

        for(int i = 0;i<3;i++){
            book[i] = new Book((int)(Math.random()*1000), (float)(Math.random()*1000),RandomString());
            library.Add(book[i]);
        }
        for (int i = 0; i < 2 ; i++) {
            journal[i] = new Journal((int)(Math.random()*1000), (float)(Math.random()*1000),RandomString());
            library.Add(journal[i]);
        }
        library.Display();
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
