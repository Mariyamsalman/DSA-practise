package lab10;

public class singlylinkedlist<T> {
Node head;
Node tail;
int  size;
public singlylinkedlist(){
    this.head=null;
    this.tail=null;
    size=0;

}

    public void addfirst(T data){
        Node temp=new Node(data,null);
        if(head==null){
            head=temp;
            tail=temp;
        }else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    public void addlast(T data){
        Node temp=new Node(data,null);
        if(tail==null){
            head=temp;
            tail=temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    public void display(){
Node current=head;
while (current!=null){
    System.out.print(current.data+"-->");
    current=current.next;
}
System.out.println("null");
    }


    private class Node<T>{
    T data;
    Node next;
    Node(T data,Node next){
        this.data=data;
        this.next=next;
    }

}
public void delete(){
    if(head==null){
        System.out.println("list is empty");
        return;
    }else{
        head=head.next;
        size--;
    }
}

public static void main(String[] args) {
    singlylinkedlist<String> list=new singlylinkedlist<>();
    System.out.println("list is created");
    list.addfirst("Mariyam");
    list.addfirst("Omaima");
    list.addfirst("bakhtawar");
    list.display();
    list.addlast("humpty" );
    list.display();
    


list.delete();
 list.display();


}




}
