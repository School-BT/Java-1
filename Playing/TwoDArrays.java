/*
FiveDice
rolls two dice
Ben Burger
9/4/2017
*/


//counted faces first
public class TwoDArrays
{
   public static int[] numsOne = {1,5,3,5,5};
   public static int[] numsTwo = {1,2,1,4,1};
   
   public static int[][] firstList = {{1,0},{2,0},{3,0},{4,0},{5,0},{6,0}};
   public static int[][] secondList = {{1,0},{2,0},{3,0},{4,0},{5,0},{6,0}};
   
   public static String WIN_STR = "WIN";
   public static String LOSS_STR = "Loss";
   public static String TIE_STR = "Tie";
   
   public static int winLossHold;
   
   
   public static void main(String[] args)
   {
      count();
      
      print("here");
      check(sortByNum(firstList),sortByNum(secondList));
      
      print("here");
      print(sortByNum(firstList));
      print("-------");
      print(sortByNum(secondList));
   }
   
   
   public static void count()
   {
      for(int i = 0;i<5;++i)
      {
         int num = numsOne[i];
         firstList[num][1] += 1;
      }
      for(int i = 0;i<5;++i)
      {
         int num = numsTwo[i];
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