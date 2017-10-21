/*
CheckerBoard
creates a checkerboard with B and W for black and white
Ben Burger
9/4/2017
*/

public class CheckerBoard
{
   //the two dimentional array
   public static String[][] board = new String[8][8];
   
   public static void main(String[] args)
   {
       stackRows();
       printBoard();
       
   }
   
   //creates x axis, use B and W every other
   //B stands for black, W stands for white
   public static void createRow(int j)
   {
      if(j%2 == 0)
      {
         for(int i = 0;i<8;++i)
         {
            board[i][j] = "B";
            i += 1;
            board[i][j] = "W";
         }
      }else
      {
         for(int i = 0;i<8;++i)
         {
            board[i][j] = "W";
            i += 1;
            board[i][j] = "B";
         }
      }
   }
   
   //uses y axis
   public static void stackRows()
   {
      for(int i = 0;i < 8;++i)
      {
         createRow(i);
      }
   }
   
   
   //Displays the board array as strings in console
   public static void printBoard()
   {
      for(int i = 0;i<8;++i)
      {
         if(i == 7)
         {
            printBoard(i);
         }else
         {
            printBoard(i);
            print("\n");
            print("\n");
         }
      }
   }
   
   public static void printBoard(int j)
   {
      for(int i = 0;i<8;++i)
      {
         print(board[i][j]);
         print(" ");
      }
   }
   
   
   public static void print(String str)
   {
      System.out.print(str);
   }
   
   
}