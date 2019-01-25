public class Library {
    private int size;
    private int index = -1;
    private Publication p[];

    public Library(int size){
        this.size = size;
        p = new Publication[size];
    }
    public void Add(Publication src){
        this.index++;
        p[this.index] = src;
    }
    public void Display(){
        System.out.println("Pages \t Price \t\t\tPublisher\tType");
        System.out.println("_____________________________________________________________________________");
        for(int i = 0;i<index+1;i++){
            System.out.println(p[i].getNoOfPages() + "\t\t " + p[i].getPrice() + "\t\t" + p[i].getPublisherName() + "\t\t" + p[i].getType());
        }
    }
}
