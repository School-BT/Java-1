/*
CoffeeShop
Handles input and creates bill for coffee shops
Ben Burger
8/22/2017
*/

import java.util.Scanner;

public class CoffeeShop
{
    final static String COF = "cof";
    final static String ESP = "esp";
    final static String TEA = "tea";

    final static double cof = 3.25;
    final static double esp = 4.25;
    final static double tea = 2.75;


    final static String ICE = "ice";
    final static String CRE = "cre";
    final static String SUG = "sug";

    final static double ice = 0;
    final static double cre = 0.50;
    final static double sug = 0.50;

    final static String CAR = "car";
    final static String CHO = "cho";
    final static String SHO = "sho";
    final static String TWO = "two";

    final static double car = 0;
    final static double cho = 0;
    final static double sho = 0;
    final static double two = 1.25;

    final static String END = "end";
    final static String ERR = "error";
    final static String PRINT = "print";


    public static double total = 0;
    public static int selector = 0;

    public static int OPT1 = 0;
    public static int OPT2 = 1;
    public static int OPT3 = 2;
    public static int OUT = 4;


    public static void main(String[] args)
    {
        pickItem();
    }


   //useing a while loop to build a customer order
    public static void pickItem()
    {

        while(selector < OUT) {
            
            //selling coffee, espresso, and tea
            while (selector == OPT1) {
                print("Would you like Coffee, Espresso, or Tea?");
                print("(To Print a reciept, type print)");
                
                selectingMain();
            }
            //uses while loops to handle customer selections
            while (selector == OPT2) {
                cofMix();
            }

            while (selector == OPT3) {
                espMix();
            }
        }

    }


   //once the customer is done this prints the bill
    public static void printReceipt()
    {
        selector = OUT;
        print("For a total of: $" + total);
    }


    //prompt to continue purchaseing or returning to main menu
    public static void post()
    { 
      print("Type 'end' to return to main menu or 'print' to get your receipt.");
    }
    
    

    //selling extras for coffee
    public static void cofMix()
    {
        print("Would you like to add Ice, " +
                "cream($0.50), sugar($0.50)?");

        selectingMain();
    }

    //selling extras for espresso
    public static void espMix()
    {
        print("Would you like to add caramel," +
                " one shot, two shots($1.25)," +
                " or chocolate?");

        selectingMain();
    }



    public static void addTea()
    {
        total += tea;
        print("added Tea");
    }

    public static void addIce()
    {
        total += ice;
        print("added ice");
    }

    public static void addCre()
    {
        total += cre;
        print("added cream");
    }

    public static void addSug()
    {
        total += sug;
        print("added sugar");
    }

    public static void addCar()
    {
        total += car;
        print("added caramel");
    }

    public static void addCho()
    {
        total += cho;
        print("added chocolate");
    }

    public static void addSho()
    {
        total += sho;
        print("added single shot");
    }

    public static void addTwo()
    {
        total += two;
        print("added double shots");
    }



    public static void selectingMain()
    {
        String str = inputHandler();
        switch(str)
        {
            case COF:
                print("added coffee");
                total += cof;
                selector = OPT2;
                break;
            case ESP:
                print("added espresso");
                total += esp;
                selector = OPT3;
                break;
            case TEA:
                addTea();
                break;
            case ICE:
                addIce();
                break;
            case CRE:
                addCre();
                break;
            case SUG:
                addSug();
                break;
            case CAR:
                addCar();
                break;
            case CHO:
                addCho();
                break;
            case SHO:
                addSho();
                break;
            case TWO:
                addTwo();
                break;
            case END:
                endRun();
                break;
            case PRINT:
                printReceipt();
                break;
        }
    }

    public static void endRun()
    {
        if(selector == OPT1)
        {
            selector = OUT;
            printReceipt();
        }else
        {
            selector = OPT1;
        }
    }



    public static String inputHandler()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String num;

        switch(str)
        {

            case "CHOCOLATE":
            case "cho":
            case "Chocolate":
            case "chocolate":
                num = CHO;
                post();
                break;
            case "car":
            case "CARAMEL":
            case "Caramel":
            case "caramel":
                num = CAR;
                post();
                break;
            case "one shot":
            case "one":
            case "singel":
            case "singleShot":
                num = SHO;
                post();
                break;
            case "doubleShot":
            case "double Shot":
            case "Double Shot":
            case "DOUBLE SHOT":
            case "DOUBLE":
            case "TWO":
            case "dobule":
            case "dou":
            case "two":
            case "TWO SHOTS":
            case "Two Shots":
            case "two Shots":
            case "Two shots":
            case "two shots":
                num = TWO;
                post();
                break;
            case "ice":
            case "ICE":
            case "Ice":
            case "Iced":
            case "iced":
            case "ICED":
                num = ICE;
                post();
                break;
            case "Cream":
            case "CREAM":
            case "cream":
            case "cre":
                num = CRE;
                post();
                break;
            case "Sugar":
            case "sugar":
            case "sug":
            case "SUGAR":
                num = SUG;
                post();
                break;
            case "Coffee":
            case "coffee":
            case "cof":
            case "COFFEE":
                num = COF;
                post();
                break;
            case "Expresso":
            case "Espresso":
            case "espresso":
            case "expresso":
            case "ESPRESSO":
            case "esp":
                num = ESP;
                post();
                break;
            case "Tea":
            case "tea":
            case "TEA":
                num = TEA;
                break;
            case "end":
                num = END;
                break;
            case "print":
            case "PRINT":
            case "Print":
                num = PRINT;
                break;
            default:
                print("Please type one of the Items listed");
                num = ERR;
                break;
        }

        return num;
    }//end inputHandler

    public static void print(String str)
    {
        System.out.println(str);
    }
}