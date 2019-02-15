import java.util.Scanner;

class BookShop{
    private Books []books;
    private int index = -1;
    BookShop(int Size){
        books = new Books[Size];
    }

    void AddBook(Books src) {
        if (index == -1) {
            index++;
            books[index] = src;
        }else{
            for (int i = 0; i < index+1; i++) {
                if (src.title.equals(books[i].title)) {
                    books[i].count++;
                    books[i].price = src.price + books[i].price;
                } else {
                     index++;
                     books[index] = src;
                }
            }
        }
    }
    void Search(String s_title, String s_author){
        for(int i =0;i<index+1;i++){
            if(s_author.equals(books[i].author) && books[i].title.equals(s_title)){
                System.out.println("Book found : ");
                while (true){
                System.out.println("Enter No of copies : ");
                Scanner sc = new Scanner(System.in);
                if(sc.nextInt() <= books[i].count){
                    System.out.println("entered no of copies found ");
                    System.out.println("Total price is : "+books[i].price);
                    break;
                }else{
                    System.out.println("Entered no of copies not found");
                    System.out.println("Enter no of copies again ? \npress 1 to YES, 2 to NO");
                    if(sc.nextInt() == 1) {
                        continue;
                    }
                    else{
                        break;
                    }
                }
                }
            }
            else
                System.out.println("Book not found");
        }
    }
    void DispAll(){
        for (int i = 0; i < index+1 ; i++) {
            System.out.print("Book "+(i+1)+" : ");
            System.out.println(books[i].toString());
        }
    }

}

class Books{
    protected String title;
    protected String author;
    protected int count;
    protected float price;

    public Books(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.count = 1;
        this.price = price;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", NoOfBooks=" + count +
                ", price=" + price;
    }

}

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Books books[] = new Books[5];
        BookShop bookShop = new BookShop(5);
        for (int i = 0; i < 5; i++) {
            books[i] = new Books("gg","gg",(float)(Math.random()*1000));
            bookShop.AddBook(books[i]);
        }
        bookShop.DispAll();
        System.out.println("Enter books title and author to find");
        bookShop.Search("gg","gg");
        System.out.println("Good Day Sir");
    }

    protected static String RandomString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        while (salt.length() < 5) {
            int index = (int) ((float) Math.random() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
}
