/*
Palindrome
Checks an input to see if it is a palindrome
Ben Burger
8/24/2017
*/
import java.util.Scanner;

public class Palindrome
{
    static String inputString;
    static String firstLetter;
    static String lastLetter;
    static String leftStr;
    static int len;

    static int selector = 0;

    public static void main(String[] args)
    {
        printTop();
        looping();
    }

    public static void setLetters(String str)
    {
        firstLetter = str.substring(0,1);
        lastLetter = str.substring(len - 1 , len);
        leftStr = str.substring(1,len - 1);
    }

    public static void looping()
    {
        do
        {
            Scanner sc = new Scanner(System.in);
            inputString = sc.nextLine();
            clearSpaces(inputString);
            leftStr = inputString;
            checkLetters(inputString);
            printTryAgain();
            if(inputString.equals("1111"))
            {
                selector = 1;
            }
        }while(selector == 0);
    }

    public static boolean checkLetters(String str)
    {
        len = str.length();

        if(len > 2)
        {
            return greatCatch();
        }else if(len == 1)
        {
            print("True");
            return true;
            
        }else if(len == 2)
        {
            return twoCatch();
        }else
        {
            print("False");
            return false;
        }
    }

   public static boolean greatCatch()
   {
      setLetters(leftStr);
               
      if(firstLetter.equals(lastLetter))
      {
           return checkLetters(leftStr);
      }else
      {
           print("False");
           return false;
      }
   }

    public static boolean twoCatch()
    {
      setLetters(leftStr);
      if(firstLetter.equals(lastLetter))
      {
         print("True");
         return true;
      }else
      {
         print("False");
         return false;
      }
    }

    public static void clearSpaces(String str)
    {
        inputString = str.replaceAll("\\s+","");
        inputString = inputString.toLowerCase();
    }

    public static void print(String str)
    {
        System.out.println(str);
    }

    public static void printTop()
    {
        print("Input the word or phrase you want to check if it is a palindrome");
        print("Type 1111 to exit");
    }
      
    public static void printTryAgain()
    {
        print("Input the word or phrase you want to check if it is a palindrome.");
        print("Type 1111 to exit.\n");
    }
}