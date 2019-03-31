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
        System.out.println("Stack of "+ Size+" is created");
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
        Stack stack = new Stack(30);
        
        stack.Pop();
        stack.Push(10);
        stack.Push(20);
        stack.Push(30);
        stack.Push(15);
        stack.Push(9);
        stack.Display();
        stack.Pop();
        stack.Pop();
        stack.Pop();
        stack.Display();
    }
}
