import java.util.Scanner;
class employee
  {
    public static void main(String args[])
    {
      int eno;
      String ename;
      double esalary;
      Scanner sc=new Scanner(System.in);

      System.out.println("enter employee number: ");
      eno=sc.nextInt();
      System.out.println("enter employee name: ");
      ename=sc.next();
      System.out.println("enter employee salary: ");
      esalary=sc.nextDouble(); 
      
      System.out.println("the employee number is "+eno);
       System.out.println("the employee name is "+ename);
       System.out.println("the employee salary is "+esalary);
    }
  }