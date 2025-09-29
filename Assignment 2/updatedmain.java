
import java.lang.reflect.Array;

public class updatedmain {
    static class genericclass<T>{
    private T[] array;
    private int size;
private int index=0;

  @SuppressWarnings("unchecked")
 public genericclass(int size){
   this.size=size;
   array=(T[]) new Object[size];
    }

public void insertelement(int index,T element){
 
for (int i = 0; i <this.size; i++) {
    if(i==index){
        array[i]=element;
    }
}
}

public void searchelement(T element){
 
for (int i = 0; i <this.size; i++) {
    if(array[i]==element){
        System.out.println("found on:"+i);
        break;
    }
}
}
public void printarray(){
    for (int i = 0; i < this.size; i++) {
        System.out.println(array[i]);
    }
}

public void deleteelement(int index){
 
for (int i = index; i <size-1; i++) {
        array[i]=array[i+1];
        
    }
size--;
}
}
public static void main(String[] args) {

        genericclass<Integer> a = new genericclass<>(3);
a.insertelement(0,10 );
a.insertelement(1,20 );
a.insertelement(2,30 );
a.printarray();
a.searchelement(20);
a.deleteelement(2);
a.printarray();


    }
}
