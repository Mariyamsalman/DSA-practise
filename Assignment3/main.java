package Assignment3;

import java.util.Arrays;  

public class main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] newarr;
        int[] newarr2;

        
        func1 a = new func1();
        func2 b = new func2();
        delete c=new delete();

        System.out.println("Original array: " + Arrays.toString(arr));

        // Insertion at random index
        long starttime = System.nanoTime();
        newarr = a.insertAtIndex(arr, 2, 23);
        long endtime = System.nanoTime();

        System.out.println("Array after insertion at random index: " + Arrays.toString(newarr));
        System.out.println("Execution time of insertion at random index: " + (endtime - starttime) + " ns");

        // Insertion at end
        long starttime2 = System.nanoTime();
        newarr2 = b.insertAtEnd(arr, 2); 
        long endtime2 = System.nanoTime();

        System.out.println("Array after insertion at end: " + Arrays.toString(newarr2));
        System.out.println("Execution time of insertion at end: " + (endtime2 - starttime2) + " ns");

         long starttime3 = System.nanoTime();
       c.deletestart(arr);
        long endtime3 = System.nanoTime();

        System.out.println("Execution time of deletion at start: " + (endtime3 - starttime3) + " ns");
         long starttime4 = System.nanoTime();
       c.deleteend(arr);
        long endtime4 = System.nanoTime();

        System.out.println("Execution time of deletion at end: " + (endtime4 - starttime4) + " ns");

         long starttime5 = System.nanoTime();
       c.deletemiddle(arr);
        long endtime5 = System.nanoTime();

        System.out.println("Execution time of deleteion at middle: " + (endtime5 - starttime5) + " ns");
    }
}
