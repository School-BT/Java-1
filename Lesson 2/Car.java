import java.util.Scanner;  
import static java.lang.Integer.valueOf;

public abstract class Car{


    public String Name;
    public int Year;
    public double Mileage;


    public String getName(){
        return Name;
    }

    public int getYear(){
        return Year;
    }

    public double getMileage(){
        return Mileage;
    }

    public abstract void setMileage();

    public abstract void setYear();

    public abstract void setName();

   
}//end Car


