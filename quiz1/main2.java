package quiz1;

public class main2{

Node head;
Node tail;
int z;
main2(){
this.head=null;
this.tail=null;
this.size=0;

}
public void addfirst(int data){
Node temp=new Node(data);
if(head==null){
    head=temp;
    tail=temp;
}else{
   temp.next=head;
   head=temp;
}
}

public void addlast(int data){
Node temp=new Node(data);

if(head==null){
    head=temp;
    tail=temp;
}else{
    tail.next=temp;
    tail=temp;
}


}
public void deletefirst(){
    if(head==null){
        System.out.println("head is empty");
    }else{
        head=head.next;
    }
}
public void deletelast(){
    if(head==null){
        System.out.println("list is empty");
        return;

    }
    if(head.next==null){
        head=null;
        tail=null;
        return;

    }
    Node temp=head;
    while(temp.next.next!=null){
        temp=temp.next;
    }
    temp.next=null;
    tail=temp;
}
public void display(){
    Node temp=head;
    while(head!=null){
        System.out.println(temp.data+"=>");
        temp=temp.next;
    }
    System.out.println("null");
}


 private class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }

  }  
public static void main(String[] args) {
    main2 obj=new main2();
obj.addfirst(30);
obj.addfirst(20);
obj.addlast(50);
System.out.println("after adding");
obj.display();
obj.deletefirst();
obj.deletelast();
   System.out.println("after deleting");

}




}
