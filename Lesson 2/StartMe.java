import static java.lang.Integer.valueOf;

public class StartMe{
   
   public static void main(String[] args){
      
      MonteCarlo monteCarlo = new MonteCarlo();
      Malibu malibu = new Malibu();
        
      makeMonte(monteCarlo);
      makeMalibu(malibu);
      
      System.out.println(showMonte(monteCarlo));
      System.out.println(showMalibu(malibu));
      
      /*
      Malibu malName = new Malibu();
      malName.setName();
      
      MonteCarlo carName = new MonteCarlo();
      carName.setName();
      
      System.out.println("Malibu Name is " + malName.getName());
      System.out.println("MonteCarlo Name is " + carName.getName());
      */
      
   }
   
   
    public static String showMonte(MonteCarlo monteCarlo){
        String monte = monteCarlo.getName() + " " + monteCarlo.getMileage() + " " + monteCarlo.getYear();
        return monte;
    }

    public static String showMalibu(Malibu malibu){
        String malibuM = malibu.getName() + " " + malibu.getMileage() + " " + malibu.getYear();
        return malibuM;
    }

    public static void makeMonte(MonteCarlo monteCarlo){
        monteCarlo.setMileage();
        monteCarlo.setYear();
        monteCarlo.setName();
    }

    public static void makeMalibu(Malibu malibu){
        malibu.setMileage();
        malibu.setYear();
        malibu.setName();
    }



}