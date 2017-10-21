/*
FiveDice
rolls two dice
Ben Burger
9/4/2017
*/

import java.util.Random;

public class FiveDice
{      
   final static int LEN = 5;
   
   public static int[][] firstList = {{1,0},{2,0},{3,0},{4,0},{5,0},{6,0}};
   public static int[][] secondList = {{1,0},{2,0},{3,0},{4,0},{5,0},{6,0}};
   
   public static String WIN_STR = "YOU WON!!!!!";
   public static String LOSS_STR = "You lost to a Computer.";
   public static String TIE_STR = "You tied a comuter. This may be more impressive than beating it...";
   
   public static int winLossHold;

   public static Die[] dice = new Die[LEN];
   public static Die[] compDice = new Die[LEN];
   
   public static void main(String[] args)
   {
      throwDice(dice);
      throwDice(compDice);
      
      count();
      
      printDice();
      check(sortByNum(firstList),sortByNum(secondList));
   }

   //rolls 5 dice
   public static void throwDice(Die[] diceArr)
   {
      
      Die one = new Die();
      Die two = new Die();
      Die three = new Die();
      Die four = new Die();
      Die five = new Die();
            
      diceArr[0] = one;
      diceArr[1] = two;
      diceArr[2] = three;
      diceArr[3] = four;
      diceArr[4] = five;
   }
   
   
   
   public static void printDice()
   {
      print("Die# | User | Comp");
      print("------------------");
      for(int i = 0;i<LEN;++i)
      {
         int j = i + 1;
         print("Die" + j + " | " + dice[i].getNum() + 
               "    | " + compDice[i].getNum());
      }
      print("------------------");
   }
   
   
   
   //prints the face of dice in rolled set
   public static void printDice(Die[] diceArr)
   {     
      for(int i = 0;i<LEN;++i)
      {
         int j = i + 1;
         print("Die" + j + " " + diceArr[i].getNum() + "");
      }
   }
 

   public static void count()
   {
      for(int i = 0;i<5;++i)
      {
         int num = dice[i].getNum() - 1;
         firstList[num][1] += 1;
      }
      for(int i = 0;i<5;++i)
      {
         int num = compDice[i].getNum() - 1;
         secondList[num][1] += 1;
      }
   }
   
   public static int checkFace(int x,int y, int passedNum)
   {  
      if(x>y)
      {
         winLossHold = 99;
         passedNum = 99;
      }else if(x<y)
      {
         winLossHold = 88;
         passedNum = 99;
      }else if(passedNum == 6)
      {
         winLossHold = 77;
         passedNum = 99;
      }else
      {
         passedNum += 1;
      }
      return passedNum;
   }  
   
   
   public static void check(int[][] first,int[][] last)
   {
      winLossHold = 0;
      for(int i = 0;i<6;++i)
      {      
         if(winLossHold == 0)
         {
            checkNumber(first[i][1],last[i][1],first[i][0],last[i][0]);
         }
      }
      printWinLos();
   }
   
   
   public static void printWinLos()
   {
      if(winLossHold == 99)
      {
         print(WIN_STR);
      }else if(winLossHold == 88)
      {
         print(LOSS_STR);
      }else if(winLossHold == 77)
      {
         print(TIE_STR);
      }
   }
   
   
   public static void checkNumber(int x,int y,int faceX,int faceY)
   {
      for(int passedNum = 0;passedNum<6;)
      {
         if(x>y)
         {
            winLossHold = 99;
            passedNum = 999;
         }else if(x<y)
         {
            winLossHold = 88;
            passedNum = 999;
         }else
         {
            passedNum = checkFace(faceX,faceY,passedNum);
         }
      }
      
   }
   
      
   public static int[][] sortByNum(int[][] list)
   {
      for(int j = 0;j<6;++j)
      {
         for(int i = 0;i<5;++i)
         {
            if(list[i][1]<list[i+1][1])
            {
               swap(i,list);
            }else if(list[i][1] == list[i+1][1])
            {
               if(list[i][0]<list[i+1][0])
               {
                  swap(i,list);
               }
            }
         }
      }
      
      return list;
   }
   
   
   public static void swap(int i,int[][] list)
   {
               //face value
               int temp = list[i][0];
               list[i][0] = list[i + 1][0];
               list[i+1][0] = temp;
               //amount of that number
               temp = list[i][1];
               list[i][1] = list[i + 1][1];
               list[i+1][1] = temp;
   }
   
   
   public static void print(int[][] list)
   {
      for(int i = 0;i<6;++i)
      {
         print("" + list[i][0] + " " + list[i][1]);
      }
   }
    
   public static void print(String str)
   {
      System.out.println(str);
   }  
   
}