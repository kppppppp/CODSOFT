import java.util.Scanner;

public class Task1{
    
    public static void
    guessTheNum()
    {
int guess;
int k=3; //guess time
Scanner Obj=new Scanner(System.in);
System.out.println("you have 3 round to guess");
int ran = 1 + (int)(10* Math.random());



for(int i=0;i<=k;i++){
System.out.println("Guess The Number from 1-10:");
guess=Obj.nextInt();

if(guess==ran){
    System.out.println("Congratulation you got a correct guess");
    break;

}
else if(guess>ran){
    System.out.println("The number gussed is lower then"+ guess);
}
else if(guess<ran){
    System.out.println("The number guessed is higher then" +guess);
}

if(k==i){
    System.out.println("Failed to guess rounds are over");
}
}
 }
        
    
public static void main (String arg[]){
    guessTheNum();
}}