import java.util.Arrays;

public class Mainlab{
 public static void main(String[] args) {
    int[] arr={1,2,3,4,5};

    int index=4;
    int size=arr.length;
     System.out.println("original array:"+Arrays.toString(arr));
     long starttime=System.nanoTime();
     //deletion of an element
    for (int i = index; i <size-1; i++) {
        arr[i]=arr[i+1];
        
    }
size--;
    System.out.println("new array:"+Arrays.toString(arr));
    long endtime=System.nanoTime();
    long timetaken=endtime-starttime;
    System.out.println("time taken:"+timetaken);

 }   
}