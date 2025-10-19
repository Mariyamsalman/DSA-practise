package lab17;

public class doublylinkedlist {
Node head;
Node tail;
int size;
public doublylinkedlist(){
this.head=null;
this.tail=null;
size=0;
} 

public void addfirst(int data){
if(head==null){
Node temp=new Node(data,null,null);
}
else{
    Node newnode=new Node(data,head,null);
    newnode.next=head;
    head.prev=newnode;
head=newnode;

}
}
public void display(){
Node temp=head;
if(head==null){
    System.out.println("list is empty");
}
while(head!=null){
System.out.println(temp.data+">");
temp=temp.next;

}


}
public void addlast(int data){
    if(head==null){
addfirst(data);
    }
    else{
        Node newnode=new Node(data,null,tail);
        tail.next=newnode;
        tail=newnode;

    }
}
public void deletefirst(){
    Node temp=head;
    if(head==null){
        System.out.println("no list");

    }else{
        temp=temp.next;
        head=temp;
        head.prev=null;
    }
}

    private class Node{
Node next;
Node prev;
int data;

public Node (int data,Node next,Node prev){
this.next=next;
this.prev=prev;
this.data=data;
}

    }
public static void main(String[] args) {
    doublylinkedlist marks=new doublylinkedlist();
    System.out.println("marks");
    marks.addfirst(100);
    marks.addfirst(200);
    marks.addfirst(10);
    marks.addlast(30);
    marks.display();
    marks.deletefirst();
    marks.display();

}












}
