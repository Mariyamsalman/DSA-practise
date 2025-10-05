package Assignment3;

public class func1 {
  public int[] insertAtIndex(int arr[], int index, int element){
    int[] newarr=new int[arr.length+1];
 for (int i = 0; i < index; i++) {
     newarr[i]=arr[i];

 }
newarr[index]=element;
for (int i = index; i < arr.length; i++) {
     newarr[i+1]=arr[i];
 }
 return newarr;
  }
}
