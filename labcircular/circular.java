package labcircular;

public class circular {
   Node head;
   Node tail;
   public circular(){
    this.head=null;
    this.tail=null;
   } 
public void addfirst(int data){
if(head==null){
    Node newnode =new Node(data,null,null);
    head=newnode;
    tail=newnode;
    head.next=head;
    head.prev=head;
}else{
    Node newnode=new Node(data,head,null);
    newnode.prev=tail;
    head.prev=newnode;
    tail.prev=newnode;
    head=newnode;
}
}
public void display(){
    if(head==null){
        System.out.println("list is empty");

    }else{
        Node temp=head;

        do { 
         System.out.println(temp.data+"<--->");  
         temp=temp.next;

        } while (temp!=head);
        System.out.println("return to head");
    }
}


public void addlast(int data){
    if(head==null){
        addfirst(data);
        return;
    }else{
        Node newnode=new Node(data,null,tail);
        newnode.next=head;
        tail.next=newnode;
        head.prev=newnode;
        tail=newnode;
    }
}
public void deletefirst(){
 
    if(head==null){
        System.out.println("list is already empty");
    return;
}if(head==tail){
            head=null;
            tail=null;
            return;
        }
        else{
            head=head.next;
          head.prev=tail;
tail.next=head;
            
        }
    }
public void deletelast(){
    if(head==null){
        System.out.println("list is empty");
        return;
    }if (head==tail){
        head=null;
        tail=null;
        return;

    }else{
        tail=tail.prev;
        tail.next=head;
        head.prev=tail;
    }
}
   
public class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data,Node next,Node prev){
        this.data=data;
this.next=next;
this.prev=prev;

    }
}
public static void main(String[] args) {
    circular obj=new circular();
    obj.addfirst(50);
    obj.display();
    obj.addfirst(20);
    obj.addlast(30);
    obj.display();
obj.deletefirst();
obj.display();
}
}
