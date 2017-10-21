import java.util.Scanner; 
import javax.swing.*; 
import static java.lang.Integer.valueOf;

public class MonteCarlo extends Car{



    @Override
    public void setMileage() {
        JFrame frame = new JFrame("inputExmpl");
        String inputOne = JOptionPane.showInputDialog(frame,"MonteCarlo Miles?");;
        Mileage = valueOf(inputOne);
    }

    @Override
    public void setYear() {
        JFrame frame = new JFrame("inputExmpl");
        String inputOne = JOptionPane.showInputDialog(frame,"MonteCarlo Year?");;
        Year = valueOf(inputOne);

    }

    @Override
    public void setName() {
        JFrame frame = new JFrame("inputExmpl");
        String inputOne = JOptionPane.showInputDialog(frame,"MonteCarlo Name?");;
        Name = inputOne;

    }
   
}//end MonteCarlo


