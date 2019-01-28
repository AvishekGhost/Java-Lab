class Book{
    private String title;
    private String [] author;
    private int noOfPages;
    private float price;
    private String publisher;

    public Book(String title, String []author, int noOfPages, float price, String publisher) {
        this.author = new String[author.length];
        this.title = title;
        for (int i =0;i< author.length;i++){
            this.author[i] = author[i];
        }
        this.noOfPages = noOfPages;
        this.price = price;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }
    public float getPrice(){
        return price;
    }

    void Display(){
        System.out.print(title+"\t");
        System.out.print(this.author[0]);
        System.out.println("\t"+ noOfPages+ "\t" + publisher+ "\t\t" + price);
        for(int i =1;i<author.length;i++) {
            System.out.print("\t" + author[i]+"\n");
        }
        System.out.println("___________________________________________________");
    }
}
