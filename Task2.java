import java.util.Scanner;
public class Task2 {
    
public static void main(String[] args) {
    String Student_name;
    int Subjects;
    float total=0;
    float avg;
    

Scanner Obj=new Scanner(System.in);

//Taking User Name Input
System.out.println("Enter Student Name");
Student_name =Obj.nextLine();

System.out.println("Enter te number of Subjects");
Subjects=Obj.nextInt();

int[]marks = new int[Subjects];

for(int i=0;i<Subjects;i++){
     
    System.out.println("Enter The Value Of The Subject "+ (i+1) +":  ");
    marks[i]=Obj.nextInt();
    total=total+marks[i];


}
avg=total/Subjects;

System.out.println("Student Name :"+Student_name);
System.out.println("Your Total marks is "+total);
System.out.println("Your Average percentage is:"+avg+"%");


if(avg>=90){
    System.out.println("Grade is A+");
}
else if(avg>=80 && avg<=90){
    System.out.println("Grade is A");
}

else if(avg>=60 && avg<=80){
    System.out.println("Grade is B");
}
else if(avg>=50 && avg<=60){
    System.out.println("Grade is C");
}
else if(avg>=35 && avg<=50){
    System.out.println("Grade is D");
}
else{
    System.out.println("Grade is F");
    System.out.println("Your Failed");
}


}



}
