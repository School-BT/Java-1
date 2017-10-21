/*
TableAndChairs
to display the following on the screen

X                    X
X                    X
X     XXXXXXXXXX     X
XXXXX X        X XXXXX
X   X X        X X   X
X   X X        X X   X

Ben Burger
8/7/2017
*/
public class TableAndChairs
{
    static String strOne =   "X                      X";
    static String strTwo =   "X                      X";
    static String strThree = "X      XXXXXXXXXX      X";
    static String strFour =  "XXXXX  X        X  XXXXX";
    static String strFive =  "X   X  X        X  X   X";
    static String strSix =   "X   X  X        X  X   X";
    static String emptyStr = "";


    public static void main(String[] args)
    {
        displayLine(emptyStr);
        displayLine(strOne);
        displayLine(strTwo);
        displayLine(strThree);
        displayLine(strFour);
        displayLine(strFive);
        displayLine(strSix);
    }


    public static void displayLine(String str)
    {
        System.out.println(str);
    }

}