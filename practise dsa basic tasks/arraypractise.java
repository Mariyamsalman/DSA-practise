import java.util.*;
public class arraypractise {
    
int[] arr=new int[5];
public void insert(){
arr[0]=1;
arr[1]=9;
arr[2]=10;
arr[3]=3;

//[1,9,10,3,0]
int index=2;

for(int i=arr.length-1;i>index;i--){
    arr[i]=arr[i-1];
      //arr[4]=arr[3]
      //arr[3] ==arr[2]               
}
arr[index]=5;

  System.out.println(Arrays.toString(arr));

}

public void delete1(){
    int index=2;
    int size=4;
arr[0]=1;
arr[1]=9;
arr[2]=10;
arr[3]=3;
arr[4]=5 ;
//[1,9,10,3,5]

for(int i=index;i<arr.length-1;i++){
    arr[i]=arr[i+1];
    //arr[2]=arr[3]
    //arr[3]=arr[4]
  
}
size--;
for (int i = 0; i <=size; i++) {
    System.out.println("after deletion from method 1:"+arr[i]);
}
}

public void delete2(){
int index=2;
arr[0]=1;
arr[1]=9;
arr[2]=10;
arr[3]=3;
arr[4]=5 ;
//[1,9,10,3,5]
int[] newarr=new int[arr.length-1];
for(int i=0;i<index;i++){
    newarr[i]=arr[i];
    //newarr[0]=arr[0]
    //newarr[1]=arr[1]
}
for(int i=index;i<arr.length-1;i++){
    newarr[i]=arr[i+1];
    //newarr[2]=arr[3]
    //newarr[3]=arr[4]
}
  System.out.println("after deleting form method 2:"+Arrays.toString(newarr));
}
public static void main(String[] args) {
    arraypractise a=new arraypractise();
      a.insert();
      a.delete1();
      a.delete2();
    }

}
