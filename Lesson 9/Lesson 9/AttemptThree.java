import java.util.ArrayList;

public class AttemptThree
{   
   
   public static ArrayList<Employee> employees = new ArrayList<Employee>();

   public static void main(String[] args)
   {
      add("1","1",1,1);
      printEmp(employees.get(0));
      add("2","2",2,2);
      printEmp(employees.get(1));
      
   }
   
   
   
   public static void add(String name, String last, int id, double wage)
   {
      Employee emp = new Employee(name,last,id,wage);
      
      employees.add(emp);
   }
   
   
   public static void printSet(ArrayList<Employee> emps)
   {
      int LEN = emps.size();
      
      for(int i = 0;i<LEN;++i)
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