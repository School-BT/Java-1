
import java.util.ArrayList;
import java.util.Scanner;


public class CoffeeShop
{
   final static String ERROR_MSG = "ERR1";
   final static String ERROR_MSG2 = "ERR2";
   final static String ERROR_MSG3 = "ERR3";

   
   public static void main(String[] args)
   {
      Order order = new Order();
      askItem(order);
      order.getTotal();
   }
   
   
   public static void selector(String input)
   {
      
   }
   
   public static void errorHandler()
   {
      print("error");
   }
   
   public static void askItem(Order order)
   {
      print("C,E,T");
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      String num;
   
      switch(str)
      {
         case "Coffee":
         case "coffee":
         case "c":
         case "COFFEE":
            askCofMix();
            break;
         case "Expresso":
         case "Espresso":
         case "espresso":
         case "expresso":
         case "ESPRESSO":
         case "e":
            askEspMix();
            break;
         case "Tea":
         case "tea":
         case "t":
         case "TEA":
            addTea(order);
            break;
         default:
            errorHandler();
            break;
      }
      
   }
   
   public static void addTea(Order order)
   {
      order.addItem("tea");
      
   }
   
   public static String askCofMix()
   {
      print("ice,cream,or sugar");
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      String num;
      
      switch(str)
      {
         case "ice":
         case "ICE":
         case "Ice":
         case "i":
         case "Iced":
         case "iced":
         case "ICED":
            num = "ice";
            break;
         case "Cream":
         case "CREAM":
         case "cream":
         case "c":
            num = "cre";
            break;
         case "Sugar":
         case "sugar":
         case "s":
         case "SUGAR":
            num = "sug";
            break;
         default:
            num = ERROR_MSG2;
            break;
      }
      
      return num;
   }
   
   
   public static String askEspMix()
   {
      print("double shot,else");
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      String num;
      
      switch(str)
      {
         case "doubleShot":
         case "double Shot":
         case "Double Shot":
         case "DOUBLE SHOT":
         case "DOUBLE":
         case "TWO":
         case "dobule":
         case "d":
         case "t":
         case "two":
         case "TWO SHOTS":
         case "Two Shots":
         case "two Shots":
         case "Two shots":
         case "two shots":
            
            num = "two";
            break;
         default:
            num = ERROR_MSG3;
            break;
      }
      
      return num;
   }

   
   public static class Order
   {
      public double total = calculateTotal();
      public static ArrayList<Integer> addIns = new ArrayList<Integer>();
      public static ArrayList<String> items = new ArrayList<String>();
      //public static ArrayList<String> items
      
      final static double COFFEE = 3.25;
      final static double ESPRESSO = 4.25;
      final static double TEA = 2.75;
      final static double CREAM = 0.50;
      final static double SUGAR = 0.50;
      final static double TWO_SHOTS = 1.25;
      
      
      public static void addItem(String newItem)
      {
         items.add(newItem);
      }
      
      public static void addMixIns(int newItem)
      {
         addIns.add(newItem);
      }
      
      double getPrice(String str)
      {
         double price;
         String input = str;
         
         switch(input)
         {
            case "cof":
               price = COFFEE;
               break;
            case "esp":
               price = ESPRESSO;
               break;
            case "tea":
               price = TEA;
               break;
            case "cre":
               price = CREAM;
               break;
            case "sug":
               price = SUGAR;
               break;
            case "two":
               price = TWO_SHOTS;
               break;
            default:
               price = 0.0;
               break;
         }
         
         return price;
      }  
      
      public void getTotal()
      {
         calculateTotal();
         print("" + total);
      }
      
      double calculateTotal()
      {  
         int useNum = items.size() - 1;
               
         for(int i = useNum; i>=0 ;i-- )
         {
            total += getPrice(items.get(i));
         }
         
         
         return total;
      }
      
      public static void addExtra(String str)
      {
         items.add(str);
      }
      
   }//end Order Class
   
   
   public static void print(String str)
   {
      System.out.println(str);
   }
   
}//end CoffeeShop Class