/*
Pay
Ben Burger
9/15/2017
*/


import javax.swing.JOptionPane;

public class Pay
{
   public static int selector = 0;
   
   public static double lvlOnePay = 17.00;
   public static double lvlTwoPay = 20.00;
   public static double lvlThreePay = 22.00;
   
   public static double otPay = 1.5;
   public static double otTotal;
   public static double regTotal;
   
   public static double medPrice = 32.50;
   public static double dentPrice = 20.00;
   public static double longPrice = 10.00;
   
   public static double retPercent = .03;
   
   public static double hourlyPay;
   public static int skillLvl;
   public static int dialogResult;
   public static double hoursWorked;
   public static double deductions;
   
   public static int med = 1;     // no = 1    yes = 0
   public static int dent = 1;    // no = 1    yes = 0
   public static int longTerm = 1;// no = 1    yes = 0
   public static int retire = 1;     // no = 1    yes = 0
   
   
   public static void main(String[] args)
   {
      getHours();
      do
      {
         lvlSelect();
      }while(selector == 0);
   }
   
   
   public static void getHours()
   {
      String string = JOptionPane.showInputDialog("Please input Hours Worked");
      hoursWorked = Double.parseDouble(string);
   }
   
   
   public static void calcDeductions(double gross)
   {
      if(med == 0)
      {
         deductions += medPrice;
      }
      if(dent == 0)
      {
         deductions += dentPrice;
      }
      if(longTerm == 0)
      {
         deductions += longPrice;
      }
      if(retire == 0)
      {
         deductions += gross * retPercent;
      }
   }
   
   
   public static void lvlSelect()
   {
      String string = JOptionPane.showInputDialog("Please input skill level");
      int lvl = Integer.parseInt(string);
         
      switch(lvl)
      {
         case 1:
            selector = 1;
            one();
            break;
         case 2:
            selector = 1;
            two();
            break;
         case 3:
            selector = 1;
            three();
            break;
         default:
            break;
      }
   }
   
   public static void one()
   {
      hourlyPay = lvlOnePay;
      skillLvl = 1;
      printFinal();
   }
   
   public static void two()
   {
      hourlyPay = lvlTwoPay;
      skillLvl = 2;
      extras();
      printFinal();
   }
   
   public static void three()
   {
      hourlyPay = lvlThreePay;
      skillLvl = 3;
      extras();
      retirement();
      printFinal();
   }
   
   
   //THIS IS WHERE THE GROSS PAY AMOUNT IS
   public static void printFinal()
   {
      double total = setNums();
      calcDeductions(total);
      double net = total - deductions;
      
      if(net <= 0)
      {
         print("Hours Worked " + hoursWorked +
                  "\nHourly Rate $" + hourlyPay +
                  "\nRegular Pay For $" + regTotal +
                  "\nOver Time Pay $" + otTotal +
                  "\nGross Pay $" + total +
                  "\nItamized Deductions:" +
                  "\n" + itamizedDeductions(total) +
                  "\n***Total Deductions: $" + deductions +
                  "***\n##########    ERROR    ##########" +
                     "\n- More deductions than income.");
      }else
      {
         print("Hours Worked " + hoursWorked +
            "\nHourly Rate $" + hourlyPay +
            "\nRegular Pay For $" + regTotal +
            "\nOver Time Pay $" + otTotal +
            "\nGross Pay $" + total +
            "\nItamized Deductions:" +
            "\n" + itamizedDeductions(total) +
            "\n***Total Deductions: $" + deductions +
            "***\nNet Pay $" + net);
       }
   }
   
   
   
   public static String itamizedDeductions(double gross)
   {
      String output = "";
      if(med == 0)
      {
         output += "-    Medical $" + medPrice;
      }
      if(dent == 0)
      {
         output += "\n-    Dental $" + dentPrice;
      }
      if(longTerm == 0)
      {
         output += "\n-    Long-Term Disability $" + longPrice;
      }
      if(retire == 0)
      {
         output += "\n-    Retirement Plan $" + gross * retPercent;
      }
      
      return output;
   }
      
   public static double setNums()
   {
      double gross;
      
      if(hoursWorked>40)
      {
         regTotal = 40*hourlyPay;
         otTotal = hourlyPay*otPay*(hoursWorked - 40);
         gross = regTotal + otTotal;
      }else
      {
         otTotal = 0;
         regTotal = hoursWorked*hourlyPay;
         gross = regTotal;
      }
      
      return round(gross);
   }
   
   
   public static double round(double input)
   {
      String temp = input + "00000";
      
      int decPlc = temp.indexOf(".") + 3;
      String front = temp.substring(0,decPlc);
      
      double roundedNum = Double.parseDouble(front);
      
      return roundedNum;
   }
   
   
   public static void retirement()
   {
      ask("Would you like to save 3% in retirement?");
      retire = dialogResult;
   }

   
   public static void extras()
   {
      ask("Would you like Medical Insurance?");
      med = dialogResult;
      ask("Would you like Dental Insurance?");
      dent = dialogResult;
      ask("WOuld you like Long-Term Disability Insurance?");
      longTerm = dialogResult;
   }
   
   
   public static void ask(String str)
   {
      dialogResult = JOptionPane.showConfirmDialog(
               null,
               str,
               "Question",
               JOptionPane.YES_NO_OPTION);
   }
   
   
   
   public static void print(String str)
   {
      JOptionPane.showMessageDialog(null,str);
   }
   
}
