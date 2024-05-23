import java. util.Scanner;
import java. lang.Math;
public class GuessingGame{
public static void main(String[] args) {
     int range=100;
    /* generete the random number in the range of 1-100
       -->random(): 1. gernates in the range of 0 and 1..inorder to get the 0-100 we multiply with range
                    2. grnerates numbers in float to get integer we explicity typecast to required form */
    
        int randomNum=(int)(Math.random()*range)+1;
        int trails=0;
        int guessNum=-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Are u ready to play??");
        String value=sc.next();
        if(value.equals("yes"))
        {
            
            while(randomNum!=guessNum){
             System.out.println("Guess the number in the range 1-100!!");
             guessNum=sc.nextInt();
            if(randomNum==guessNum)
            {
             System.out.println("Awesome,correct guess");
             System.out.println("you take "+trails+ " trails to guess correctly");
            }
            else if(randomNum>guessNum)
            {
             System.out.println("u are too loww,try again!!");
            }
            else
            {
                System.out.println("u are tooo high!!");
            }
            trails++;
         }
        }
        else
        {
            System.out.println("try later then!");
        }

    }
}

