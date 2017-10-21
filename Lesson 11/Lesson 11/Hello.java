/*
Hello
stub out a JFrame
Ben Burger
9/12/2017
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hello extends JFrame implements ActionListener
{
   //Feedback JLabel for user
   JLabel helloPhrase = new JLabel("");
   //text field for first name
   JLabel firstLabel = new JLabel("Enter Your First Name");
   JTextField first = new JTextField(12);
   //text field for last name
   JLabel lastLabel = new JLabel("Enter Your Last Name");
   JTextField last = new JTextField(12);
   //JButton to cause updating Hello
   JButton submit = new JButton("Go!");


   public Hello()
   {
      super("Hello");
      setSize(200,200);
      setLayout(new FlowLayout());
      add(helloPhrase);
      add(firstLabel);
      add(first);
      add(lastLabel);
      add(last);
      add(submit);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      submit.addActionListener(this);
   }
   
   //JLabel will update feedback JLabel with a concatenation
   //of the first and last name with hello.
   @Override
   public void actionPerformed(ActionEvent e)
   {
      String firstIn = first.getText();
      firstIn = firstIn.substring(0, 1).toUpperCase() + firstIn.substring(1); 
      String lastIn = last.getText();
      lastIn = lastIn.substring(0, 1).toUpperCase() + lastIn.substring(1); 
      helloPhrase.setText("Hello " + firstIn + " " + lastIn);
   }  
   
   
   public static void main(String[] args)
   {      
      JFrame frame = new Hello();
      frame.setVisible(true);
   }
   


}