import javax.swing.JFrame;
import java.awt.FlowLayout;

import javax.swing.*;

public class SwingFun extends JFrame
{
   public SwingFun()
   {
      super("Swing Fun");
      setSize(250,250);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JLabel label = new JLabel("Enter Your Name");
      JTextField name = new JTextField(12);
      JButton submit = new JButton("Submit");
      setLayout(new FlowLayout());
      add(label);
      add(name);
      add(submit);
   }
    
   public static void main(String[] args)
   {      
      JFrame frame = new SwingFun();
      frame.setVisible(true);
   }

}