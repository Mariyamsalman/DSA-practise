package Assignment3;

public class delete {
    public void deletestart(int[] arr){
        int newarr[]=new int[arr.length];
        int size=newarr.length;
        for (int i =0; i < newarr.length-1; i++) {
            newarr[i]=arr[i+1];
        }
    size--;
      System.out.print("array after deletion from start:");
for (int i = 0; i < size; i++) {
    System.out.print(newarr[i]);
    
}}
 public void deleteend(int[] arr){
        int size=arr.length;
    size--;
       System.out.println("array after deletion from end:");
for (int i = 0; i < size; i++) {
    System.out.println(arr[i]);
    
}
    }
     public void deletemiddle(int[] arr){
        int newarr[]=new int[arr.length];
        int index=2;
        int size=newarr.length;
        for (int i =index; i < newarr.length-1; i++) {
            newarr[i]=arr[i+1];
        }
    size--;
     System.out.println("array after deletion from middle:");
for (int i = 0; i < size; i++) {
    System.out.println(newarr[i]);
    
}}
}
