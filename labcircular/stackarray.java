package labcircular;

public class stackarray {
    private int[] arr;
    private int size;
    private int capacity;
    public stackarray(int capacity){
this.size=0;
this.capacity=capacity;
this.arr=new int[capacity];
    } 
public void push(int data){
    if(size==capacity){
        System.out.println("list is empty");
    }
    arr[size]=data;
    size++;
}
public void pop(){
if(isEmpty()){
    System.out.println("stack is empty");
    return;
}
int popped=arr[size-1];
size--;
System.out.println(popped+"popped from stack");
}



public boolean isEmpty(){
return size==0;
}

public boolean isfull(){
    return size==capacity;
}

public void display(){
    if(isEmpty()){
        System.out.println("stack is empty");
        return;
    }
    for (int i = 0; i < size; i++) {
        System.out.println(arr[i]+" ");
    }
    System.out.println();
}

public void peek(){
  if(isEmpty()){
        System.out.println("stack is empty");
        return;
    }
System.out.println(arr[size-1]);
}
public static void main(String[] args) {
    stackarray obj=new stackarray(5);
    obj.push(23);
    obj.push(30);
    obj.push(40);
    obj.display();
    obj.pop();
    obj.display();
    obj.push(40);
    obj.display();

    System.out.println("peeked element ");
obj.peek();
}



}
