import java.util.Scanner;  
import javax.swing.*;
import static java.lang.Integer.valueOf;


public class Malibu extends Car{


    @Override
    public void setMileage() {
        JFrame frame = new JFrame("inputExmpl");
        String inputOne = JOptionPane.showInputDialog(frame,"Malibu Miles?");;
        Mileage = valueOf(inputOne);
    }

    @Override
    public void setYear() {
        JFrame frame = new JFrame("inputExmpl");
        String inputOne = JOptionPane.showInputDialog(frame,"Malibu Year?");;
        Year = valueOf(inputOne);

    }

    @Override
    public void setName() {
        JFrame frame = new JFrame("inputExmpl");
        String inputOne = JOptionPane.showInputDialog(frame,"Malibu Name?");;
        Name = inputOne;

    }
   
}//end Malibu


