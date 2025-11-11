public class task2 {
   
Node head;
Node tail;

public task2(){
this.head=null;
this.tail=null;
}

public void addfirst(String data){
    Node temp=new Node(data);
if(head==null){
head=temp;
tail=temp;
}else{
temp.next=head;
head=temp;
}

}

public void addlast(String data){
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
        System.out.println("list is empty");
        return;
    }else{
    head=head.next;

    }
     
}
 public void deletelast() {
     if (head == null) {
           System.out.println("List is empty");
    return;
        }
        if (head.next == null) {
        head = null;
            tail = null;
    return;
        }
     Node temp = head;
        while (temp.next.next != null) {
           temp = temp.next;
        }
    temp.next = null;
     tail = temp;
    }

public void display(){
    if(head==null){
        System.out.println("list is empty");
    }else{
        Node temp=head;
        while(temp!=null){
       System.out.println(temp.data+"-->");
    temp=temp.next;
        }
        System.out.println("null");
    }
}


 private class Node{
        Node next;
        String data;
Node(String data){
    this.data=data;
    this.next=null;
}
    }
public static void main(String[] args) {
    task2 obj=new task2();
    obj.addfirst("Mariyam");
    obj.addfirst("omaima");
    obj.addfirst("Bakhtawar");
    obj.addfirst("Manal");
    System.out.println("after adding names:");
    obj.display();
obj.addlast("sufiyan");
System.out.println("after adding in last");
obj.display();
obj.deletefirst();
System.out.println("after deleting from first");
obj.display();
obj.deletelast();
System.out.println("after deleting from last");
obj.display();



}

}




