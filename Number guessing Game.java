
//Number guessing Game
import java.util.*;
class game{
    public static void main(String[] args) {
      
      Random random=new Random();
      int s=random.nextInt(100)+1;
       System.out.println("Guess the number between 1 to 100");
       Scanner sc=new Scanner(System.in);
       int g=sc.nextInt();
       while(true)
       {     if(s==g)
           {
               System.out.println("congratulations! you guessed the correct number");
               break;
        
           }
           else if(g<s)
           {
               System.out.println("sorry this number is too low");
           }
           else if(g>s)
           {
               System.out.println("sorry this number is too high");
           }
          
            System.out.println("Guess the number between 1 to 100");
           g=sc.nextInt();
       }
       
    }
}