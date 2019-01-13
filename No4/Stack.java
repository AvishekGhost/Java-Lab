public class Stack{
    private int Top = -1;
    private int Size;
    private int []Array;
    
    Stack(){
        this.Size = 0;
        Array = new int[0];
        System.out.println("its an empty stack");
    }

    Stack(int Size){
        this.Size = Size;
        Array = new int[Size];
    }

    void Push(int element){
        if(this.Top  >= this.Size-1){
            System.out.println("stack overflow");
        }
        else{
            this.Top++;
            this.Array[this.Top] = element;
            System.out.println(element + " is pushed");
        }
    }

    void Pop(){
        if(Top == -1){
            System.out.println("Stack underflwo");
        }
        else{
            System.out.println(this.Array[this.Top] + " is poped");
            --this.Top;
        }
    }

    void Display(){
        for(int i = 0 ; i<Top+1 ;i++){
           System.out.println(Array[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        
        stack.Pop();
        stack.Push(1);
        stack.Push(10);
        stack.Push(10);
        stack.Push(10);
        stack.Push(11);
        stack.Pop();
        stack.Push(12);
        stack.Display();

    }
}
