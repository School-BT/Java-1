import java.awt.BorderLayout;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class TablePlay extends JFrame implements ActionListener
{
  static ArrayList<String> names = new ArrayList<String>();
  static ArrayList<String> numbers = new ArrayList<String>();
  
  static JFrame frame;
  
  static DefaultTableModel model = new DefaultTableModel(); 
  static JTable table = new JTable(model);
  
  JScrollPane scrollPane = new JScrollPane(table);
  JPanel paneText = new JPanel(new FlowLayout());
  
  JLabel nameHint = new JLabel("Name:");
  JLabel numHint = new JLabel("Number:");
  JTextField nameIn = new JTextField(12);
  JTextField numIn = new JTextField(12);
  
  JButton addBtn = new JButton("Add");
  JButton saveBtn = new JButton("Save");

  public TablePlay()
  {
    super("Contacts");
    setLayout(new BorderLayout());
    add(paneText,BorderLayout.NORTH);
    
    model.addColumn("Name"); 
    model.addColumn("Number"); 
    add(scrollPane,BorderLayout.CENTER);
    
    paneText.add(nameHint);
    paneText.add(nameIn);
    paneText.add(numHint);
    paneText.add(numIn);
    paneText.add(addBtn);
    paneText.add(saveBtn);
    
    addBtn.addActionListener(this);
    saveBtn.addActionListener(this);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }


public static void main(String args[]) 
  {
    frame = new TablePlay();
    frame.pack();
    frame.setVisible(true);
    
    readFile();
  }

   //What happens when button is pushed
   @Override
   public void actionPerformed(ActionEvent e)
   {
      if(e.getSource() == addBtn)
      { 
        String name = nameIn.getText();
        String number = numIn.getText();
        addToTable(name,number);
        
      }else
      {  
         saveData();
      }  
   }  
  
   static void readFile()
   {
      try 
      {         
         BufferedReader in = new BufferedReader(new FileReader("note.txt"));
         String name;
   
         while((name = in.readLine()) != null)
         {
            String phoneNum = in.readLine();
            
            addToTable(name,phoneNum);
         }

         in.close();
         
      }catch (IOException e) 
      {
      }
   }
   
   static void addToTable(String name,String number)
   {
      DefaultTableModel model = (DefaultTableModel) table.getModel();
      model.addRow(new Object[]{name,number});
      addNumberItem(name,number);
   }
   
   public static void addNumberItem(String name, String number)
   {
      names.add(name);
      numbers.add(number);
   }
      
   
   public static void saveData()
   {
      BufferedWriter writer = null;
      try
      {
          writer = new BufferedWriter(new FileWriter("note.txt"));
          int LEN = names.size();
          for(int i = 0;LEN>i;++i)
          {
            writer.write(names.get(i) + "\n" + numbers.get(i) + "\n");
          }
      }
      catch ( IOException e)
      {
      }
      finally
      {
          try
          {
              if ( writer != null)
              writer.close( );
          }
          catch ( IOException e)
          {
          }
      }
   }



}