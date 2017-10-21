/*
Student
Object that holds firs and last names, GPA and Student Ids
8/29/2017
Ben Burger
*/

public class Student
{
   //fields
    String name;
    double gpa;
    int id;
    
    public Student()
    {
      name = "Name";
      gpa = 4.0;
      id = 1;
    }
    
    public Student(int i)
    {
      name = "Name" + i;
      gpa = 0.5 + i;
      id = i;
    }
      
    String getName() {
        return name;
    }

    void setName(String namex) {
        name = namex.substring(0, 1).toUpperCase() + namex.substring(1).toLowerCase();
    }

    double getGpa() {
        return gpa;
    }

    void setGpa(double gpax) {
        gpa = gpax;
    }

    int getId() {
        return id;
    }

    void setId(int idx) {
        id = idx;
    }
    
}