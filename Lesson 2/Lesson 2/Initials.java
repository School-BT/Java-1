/*
Initials
Prints my three initials seperated by periods after declairing my three initials
Benjamin David Burger
8/5/2017
*/




public class Initials
{
   final static char FIRST = 'B';
   final static char SECOND = 'D';
   final static char THIRD = 'B';
   final static String SEPERATOR = ".";
   static String outputString;
   
   public static void main(String[] args)
   {
      buildInitials();
      
      System.out.print(outputString);
      
   }
   
   
  
   public static void buildInitials()
   {
      outputString = FIRST + SEPERATOR +
                     SECOND + SEPERATOR +
                     THIRD + SEPERATOR;
   }
}