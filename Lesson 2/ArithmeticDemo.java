import java.util.Scanner;

public class ArithmeticDemo
{
   public static void main(String[] args)
   {
      double firstNumber;
      double secondNumber;
      double sum;
      double difference;
      double average;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter integer >>");
      firstNumber = input.nextDouble();
      System.out.print("Please enter another int >>");
      secondNumber = input.nextDouble();
      
      sum = firstNumber + secondNumber;
      difference = firstNumber - secondNumber;
      average = sum / 2;
      
      System.out.println("Sum >> " + sum);
      System.out.println("Difference >> " + difference);
      System.out.println("Average >> " + average);
   }
}