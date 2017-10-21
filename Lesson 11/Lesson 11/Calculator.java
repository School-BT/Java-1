/*
Calculator
Make a calculator
Ben Burger
9/12/2017
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Name extends JFrame implements ActionListener
{
   JButton switchBtn = new JButton("=");
   JLabel results = new JLabel("");
   
   String[] names = {"Bob","Sally","Mike","Alice","Tom"};
   
   int i = 0;

   public Name()
   {
      super("Name Program");
      setSize(175,200);
      setLayout(new FlowLayout());
      add(results);
      results.setText(names[0]);
      add(switchBtn);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      switchBtn.addActionListener(this);
   }
   
   
   public void actionPerformed(ActionEvent e)
   {
      if(e.getSource() == switchBtn)
      {
         switchAct(e);
      }
   }
   
   
   
   public void switchAct(ActionEvent e)
   {
      i+=1;
      
      if(i == 5)
      {
         i = 0;
      }
      
      results.setText(names[i]);
   } 
   
  
   public static void main(String[] args)
   {      
      JFrame frame = new Name();
      frame.setVisible(true);
   }
   


}