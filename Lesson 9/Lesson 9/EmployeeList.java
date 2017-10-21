import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList
{
   public static ArrayList<Employee> employees = new ArrayList<Employee>();
      
   public static String name;
   public static String last;
   public static int id;
   public static double wage;
   
   public static int first;
   public static int second;
   public static int third;
   public static int len;
   
   public static int selector = 0;
   public static String userIn;
   
   public static void main(String[] args)
   {
      do
      {
         printTop();
         add(buildEmp());
         inputSelector();
      }while(selector == 0);
      
      printArr(employees);
   }
   
   
   public static void printTop()
   {
      print("Please enter the Employee's Data" +
            " seperated by exactly one space\n" +
            "first name, last name, numeric" +
            " ID and hourly wage.\n");    
      
      print("For example:\nJohn Smith 123456 12.50\n");      
                
   }
   
   
   //user ends input
   public static void inputSelector()
   {
      print("Are you finished? Y/N");
      
      Scanner sc = new Scanner(System.in);
      
      String str = sc.next();
      if(str.equals("Y")||str.equals("y")||str.equals("yes"))
      {
         selector = 1;
      }else
      {
         selector = 0;
      }
   }
   
   
   //takes 1 line of user input data seperated by spaces
   //single input String, reads in the first, last name,
   //id#, and wage
   public static void input()
   {
      Scanner sc = new Scanner(System.in);
      
      userIn = sc.nextLine();
   }
   
   
   public static void getSections()
   {
      input();
 
      first = userIn.indexOf(' ');
      second = userIn.indexOf(' ',++first);
      third = userIn.indexOf(' ',++second);
      len = userIn.length();
   }
   
   
   //parses user input into seperate variables
   public static void breakDown()
   {
      getSections();
      
      name = userIn.substring(0,first - 1);
      last = userIn.substring(first,second - 1);
      id = Integer.parseInt(userIn.substring(second,third));
      wage = Double.parseDouble(userIn.substring(third,len));
   }   
   
   
   public static Employee buildEmp()
   {
      breakDown();
      
      Employee emp = new Employee(name,last,id,wage);
      
      return emp;
   }
   
   
   public static void add(Employee emp)
   {
      employees.add(emp);
   }
   
     
   public static void printAll(String namex,String lastx,int idx,double wagex)
   {
      print("  Employee name: " + namex + " " + lastx);
      print("  ID: " + idx);
      print("  Hourly wage: $" + wagex);
   }
   
   
   public static void printArr(ArrayList<Employee> emps)
   {
      int LEN = emps.size() ;
      for(int i = 0; i<LEN ; ++i)
      {
         printEmp(emps.get(i));
      }
   }
   
   public static void printEmp(Employee emp)
   {
      print(emp.getName());
      print(emp.getLast());
      print(emp.getId() + "");
      print(emp.getWage() + "");
   
   }
   
   public static void print(String str)
   {
      System.out.println(str);
   }
   
}