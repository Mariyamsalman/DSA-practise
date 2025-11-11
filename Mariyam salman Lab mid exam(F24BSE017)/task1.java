public class task1 {
    int[] arr;
    int capacity;
    int size;
    task1(int capacity){
     this.capacity=capacity;
     arr= new int[capacity];
this.size=0;
    }
   public void insert(int copies){
    if(size==capacity){
        System.out.println("array capacity is full");
        return;
    }else{
        arr[size]=copies;
        size++;
    }
   }
public void deleteat(int index){
if(index<0||index>size){
    System.out.println("invalid index");
    return;

}else{
for(int i=0;i<size-1;i++){
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
    for(int i=0;i<size;i++){
        System.out.println(arr[i]);
    }
    }
}
public void sort(){
    if(size==0){
    System.out.println("array is empty");
    return;
}
else{
    for(int i=0;i<size-1;i++){
   for(int j=0;j<size-i-1;j++)
if(arr[j]>arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
    }
}
}
public static void main(String[] args){
    
task1 obj=new task1(3);

obj.insert(21);
obj.insert(23);
obj.insert(25);
System.out.println("before deleting:");
obj.display();
obj.deleteat(0);
System.out.println("after deleting");
obj.display();
obj.sort();
System.out.println("sorted copies:");
obj.display();
}

}

