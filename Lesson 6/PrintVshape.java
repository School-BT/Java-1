import java.util.ArrayList;

public class PrintVshape
{
   final static int WIDTH_NUM = 11;//must be odd
   final static String LETTER = "V";
   final static int LEN_NUM = WIDTH_NUM / 2 - 1;
   
   
	public static void main(String[] args)
   {
      fullGo();
   }
	
   
   public static void fullGo()
   {
      int width = LEN_NUM;
      
      for(int i = width;i>=0;--i)
      {
         print(buildStr(i));
      }
      
      print1(addFinalV());
   }
   
   
   public static String buildStr(int input)
   {
      String str = "";
      int i = input;
      
      str = makeFront(i) + makeMid(i);
      
      return str;
   }
   
   public static String makeFront(int i)
   {
      int input = LEN_NUM - i - 1;
      String str = "";
      
      for(int j = 0;j<=input;++j)
      {
         str += " ";
      }
      
      str += LETTER;
      
      return str;
   }
   
   public static String makeMid(int i)
   {
      int input = i * 2;
      String str = "";
      
      for(int j = input;j>=0;--j)
      {
         str += " ";
      }
      
      str += LETTER;
      
      return str;

   }
   
   public static String addFinalV()
   {
      int input = LEN_NUM;
      String str = "";
      
      for(int j = input;j>=0;--j)
      {
         str += " ";
      }
      
      str += LETTER;
      
      return str;
   }
   
	public static void printArr(ArrayList<String> arr)
	{
		int arLen = arr.size();
		
		for(int i = arLen;i>=0;--i)
		{
			print(arr.get(i));
		}
	}
	
	public static void print(String str)
	{
		System.out.println(str);
	}
   
   public static void print1(String str)
	{
		System.out.print(str);
	}
}