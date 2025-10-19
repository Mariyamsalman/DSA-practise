package quiz1;

public class main {
   
    int[] arr;
    int capacity;//max num it can hold
    int size;//current num of elements
    public main(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        this.size=0;
    }
    public void insert(int value){
        if(capacity==size){
System.out.println("no capacity");
        }else{ 
arr[size]=value;
size++;
        }
   }
   public void delete(int index){
    if(index<0||index>capacity){
        System.out.println("invaid index");
        return;
    }else{
for (int i=index;i<capacity-1;i++) {
        arr[i]=arr[i+1];
    }
size--;
    }

   }
   public void display(){
    if(size==0){
System.out.println("array is empty");
return;
    }else{
        for(int i=0;i<size;i++)
        System.out.println(arr[i]);
    }
}
public void sort(){
    if(size==0){
System.out.println("array is empty");
return;
    }else{
    
        for (int i = 0; i <size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
               if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
               }
            }
        }
    }

    
    }

public static void main(String[] args) {
   main obj=new main(5);
obj.insert(60);
obj.insert(20);
obj.insert(70);
obj.insert(40);
obj.insert(50);
System.out.println("befor deletion and sorting");
obj.display();
obj.delete(2);
obj.sort();

System.out.println("after deletion and sorting");
obj.display();

}


}
