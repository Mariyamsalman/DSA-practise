import java.util.*;
public class arraypractise {
  int size;
  int capacity;
  int[] arr;
    public arraypractise(int capacity) {
 this.size=0;
  this.capacity=capacity;
 arr=new int[capacity];
    }
    

public void insert(int index,int data){
if(size==capacity){
  System.out.println("no more space");
}else if (size==0) {
    arr[index]=data;
    size++;
}else{
for(int i=arr.length-1;i>index;i--){
    arr[i]=arr[i-1];              
}
arr[index]=data;
size++;
  System.out.println(Arrays.toString(arr));

}
}

public void delete1(int index){
if(index<0||index>=size){
  System.out.println("invalid index");
}else{
for(int i=index;i<arr.length-1;i++){
    arr[i]=arr[i+1];
  
}
size--;
for (int i = 0; i <size; i++) {
    System.out.println("after deletion from method 1:"+arr[i]);
}
}
}
public void delete2(int index){
if(index<0||index>=size){
  System.out.println("invalid index");
}else{
int[] newarr=new int[arr.length-1];
for(int i=0;i<index;i++){
    newarr[i]=arr[i];
    //newarr[0]=arr[0]
    //newarr[1]=arr[1]
}
for(int i=index;i<arr.length-1;i++){
    newarr[i]=arr[i+1];
    //newarr[2]=arr[3]
    //newarr[3]=arr[4]
}
  System.out.println("after deleting form method 2:"+Arrays.toString(newarr));
}
}
public static void main(String[] args) {
   
    Scanner sc=new Scanner(System.in);
     System.out.println("give the capacity you want to keep");
      int capacity=sc.nextInt();
          arraypractise a=new arraypractise(capacity);

    System.out.println("give the number you want to insert");
    int num=sc.nextInt();
        System.out.println("give the index on you want to insert");
        int index=sc.nextInt();
            a.insert(index,num);
      
            System.out.println("give the number you want to insert");
        num=sc.nextInt();
        System.out.println("give the index on you want to insert");
         index=sc.nextInt();
             a.insert(index,num);
           
             System.out.println("give the number you want to insert");
        num=sc.nextInt();
        System.out.println("give the index on you want to insert");
         index=sc.nextInt();
             a.insert(index,num);
           
             System.out.println("give the number you want to insert");
        num=sc.nextInt();
        System.out.println("give the index on you want to insert");
         index=sc.nextInt();
             a.insert(index,num);
           
          
         System.out.println("give the index from where you want to delete from method 1");
       index=sc.nextInt();
       a.delete1(index);
       
       System.out.println("give the index from where you want to delete from method 2");
       index=sc.nextInt();
      a.delete2(index);
    }

}
