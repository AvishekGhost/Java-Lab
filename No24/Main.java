import java.util.Arrays;

class SearchingThread extends Thread{
    int []arr;
    int searchElement;
    int token;

    public SearchingThread(int []arr, int searchElement, int token){
        this.arr = new int[arr.length];
        this.arr = arr;
        this.searchElement = searchElement;
        this.token = token;
    }

    public synchronized void run(){
        int result = Arrays.binarySearch(this.arr, this.searchElement);
        if( result < 0){
            System.out.println(searchElement +" is NOT" +
                    " found in the Array--");
            System.out.println(Arrays.toString(this.arr));
            System.out.println();
        }else {
            System.out.println(searchElement+" Is FOUND at Index "+result+" in Array--");
            System.out.println(Arrays.toString(this.arr));
            System.out.println();
        }
    }
}

public class Main{
    public static void main(String[] args) throws Exception {
        int n = 5;
        SearchingThread searchingThread[] = new SearchingThread[n];
        for (int i = 0; i < n; i++) {
            int e = (int)(Math.random()*100);
            searchingThread[i] = new SearchingThread(randomSortedArrayGenerator(), e, i);
            searchingThread[i].start();
            searchingThread[i].join();
        }

    }

    public static int [] randomSortedArrayGenerator(){
        int size ;
        while (true){
            int i = 1;
            size = i * (int)(Math.random()*10);
            if(size == 0) size = 10;
            if(size % 10 == 0) break;
        }
        int [] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
        }
        Arrays.sort(arr);

        return arr;
    }
}
