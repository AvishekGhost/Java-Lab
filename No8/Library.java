public class Library {
    Book books[]= new Book[5];
    int index = -1;

    void Add(Book src){
        if(this.index > 5) {
            System.out.println("max books added");
            return;
        }
        else {
            this.index++;
            books[this.index] = src;
        }
    }
    void Remove(Book src){
        for(int i =0;i<this.index;i++){
            if(books[i].getTitle() == src.getTitle() ){
                for(int j = i;j<this.index;j++){
                    books[j] = books[j+1];
                }
                this.index--;
            }else
                System.out.println("Nothing to delete");
        }
    }
}
