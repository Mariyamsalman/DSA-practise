package queuewithsinglylinkedlisthashing;

public class QueueLL {
 Node rear;//tail
 Node front;//head
 public QueueLL(){
    this.rear=null;
    this.front=null;
 }
    public boolean isEmpty(){
        return front==null;
    }
public void enqueue(int data){
    Node newnode=new Node(data);
if(isEmpty()){
front=rear=newnode;
}else{
   rear.next=newnode;
   rear=newnode;
}
}

public int dequeue(){
 if(isEmpty()){
    System.out.println("the list is already empty");
    return -1;
 }
 int removed=front.data;
    front=front.next;
if(front==null){
rear=null;
}
return removed;
}
public int peek(){
    if(isEmpty()){
        System.out.println("queue is empty");
        return -1;
    }
   return front.data;

}
public void displayelements(){
    if(isEmpty()){
        System.out.println("queue is empty");
        return ;

    }
Node temp=front;
System.out.println("Queue:");
while(temp!=null){
System.out.println(temp.data+"==>");
temp=temp.next;
}


}

private class Node{
    int data;
    Node next;
 public Node(int data){
    this.data=data;
    this.next=null;
 }
}

public static void main(String[] args) {
    QueueLL a=new QueueLL();
    a.enqueue(10);
    a.enqueue(20);
    a.enqueue(30);
   System.out.println("peeked element "+a.peek());
   a.displayelements();
   a.dequeue();
   a.displayelements();
}
 
}
