import java.util.*;
class Employee
{
   private String name;
   private int age;
   private double salary;
 public Employee()
 {
   name=null;
   age=0;
   salary=0.0;
 }
 public Employee(String name,int age,double salary)
 {
   this.name=name;
   this.age=age;
   this.salary=salary;
 }
 public Employee(Employee emp)
 {
    name=emp.name;
    age=emp.age;
    salary=emp.salary;
 }
 public void read()
 {
  Scanner sc=new Scanner(System.in);
  String name=sc.nextLine();
  int age=sc.nextInt();
  double salary=sc.nextDouble();
 }
 public void show()
 {
   System.out.println("Name is :"+name);
   System.out.println("Age is :"+age);
   System.out.println("Salary is :"+salary);
 }

}
class Program
{
 public static void main(String []args)

 { 
   Employee e = new Employee();
   e.show();
   Employee e1 = new Employee("Uttam",22,21000.45);
   e1.show();
   Employee e2 = new Employee(e1);
   e2.show();
 }
}
