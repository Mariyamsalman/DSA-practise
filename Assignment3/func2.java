package Assignment3;

public class func2 {
   public int[] insertAtEnd(int arr[], int element){
    int newarr[]=new int[arr.length];
    for (int i = 0; i < newarr.length; i++) {
        newarr[i]=arr[i];
    }
    newarr[newarr.length-1]=element;
    
    return newarr;
   }
}
