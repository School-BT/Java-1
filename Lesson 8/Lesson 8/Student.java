/*
Student
Object that holds firs and last names, GPA and Student Ids
8/29/2017
Ben Burger
*/

public class Student
{
   //fields
    String first;
    String last;
    double gpa;
    int id;

    public Student(int i)
    {
        setFirst("name" + i);
        setGpa(1.2 + i);
        setId(0 + i);
        setLast("last" + i);
    }
    public Student(String firstx,String lastx,int idx,double gpax)
    {
      setFirst(firstx);
      setLast(lastx);
      setGpa(gpax);
      setId(idx);
    }
    
    String getFirst() {
        return first;
    }

    void setFirst(String firstx) {
        first = firstx;
    }

    String getLast() {
        return last;
    }

    void setLast(String lastx) {
        last = lastx;
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