public class main{
public static void main(String[] args) {
    String name="Mariyam";
    int rollno=017,sum=0;
    int[] marks={10,20,30,40,50};
    double avg;

    //displaying all student details
    System.out.println("name is:"+name+"rollno is:"+rollno);
    System.out.println("marks are:");
    for (int i = 0; i <=4; i++) {
        System.out.println(marks[i]);
        sum=sum+marks[i];
    }
    //calculating average marks
avg=sum/5;
System.out.println("average is:"+avg);
//search student by roll no
int[] rollnumsofstuds={1,2,3,4,5,6,7,8,9,10};
int rollnumtobesarched=7;
for (int i = 0; i < 9; i++) {
    if(rollnumsofstuds[i]==rollnumtobesarched){
        System.out.println("roll number found on:"+i);
        break;
    }
    
}
}
}