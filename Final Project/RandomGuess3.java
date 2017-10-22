/*
RandomGuess3
Ben Burger
9/15/2017
*/

import java.util.*;


public class RandomGuess3
{
   public static int selector;
   public static int guessedNumber = 5;
   public static int randomNumber;
   
   public static int randomHigh = 1000;
   public static int randomLow = 1;
   
   public static void main(String[] args)
   {
      do
      {
         int counter = 0;
         randomize();
         print("You are playing a HIGH-LOW guessing game.");
         print("Please guess any number between " + randomLow +
               " and " + randomHigh);
         do
         {
            inputHandler();
            counter += 1;
         }while(selector != -2);
         print("You guessed " + counter + " times.");
         print("If you would like to play again enter: Yes or No");
         replay();
                  
      }while(selector != -1);
      
      print("Thank You For Playing!");
   }
   
   
   public static void randomize()
   {
      Random rand = new Random();
      
      randomNumber = rand.nextInt(randomHigh) + randomLow;  
   }
   
   
   public static void checkNum(int num)
   {
      selector = 0;
      
      if(num > randomNumber)
      {
         print("Too High: Guess Again");
      }else if(num < randomNumber)
      {
         print("Too Low: Guess Again" );
      }else
      {
         print("YOU WWWIIINNN!!! ");
         selector = -2;
      }
   }
   
   
   public static void replay()
   {
      Scanner scan = new Scanner(System.in);
      String input = scan.next();
      
      switch(input)
      {
         case "NO":
         case "no":
         case "No":
            selector = -1;
            break;
         default:
            selector = -2;
            break;
      }
    }
   
   
   public static void inputHandler()
   {
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();
      
      checkNum(input);
   }
   
   
   public static void print(String str)
   {
      System.out.println(str);
   }
}
