/*
FavoriteSong
display 4 lines of my favorite song
Ben Burger
8/7/2017
*/

public class FavoriteSong
{
    //this string is quoted from the song "The Sound of Silence"
    // by Simon & Garfunkel. Gathered from Google.com search(Sound of Silence)
    static String strOne =   "Hello darkness, my old friend \n" +
     "I've come to talk with you again \n" +
     "Because a vision softly creeping \n" +
     "Left its seeds while I was sleeping \n" +
     "And the vision that was planted in my brain \n" +
     "Still remains \n" +
     "Within the sound of silence";


    public static void main(String[] args)
    {
        displayLine(strOne);
    }
   
   
   public static void displayLine(String str)
    {
        System.out.println(str);
    }  
}