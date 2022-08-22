import java.util.*;
class bill
  {
    public static void main(String args[])
    {
      int pno;
      String pname;
      float pcost,pqty,bill;
       
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter product number = ");
      pno=sc.nextInt();
      System.out.println("Enter product name = ");
      pname=sc.next();

      System.out.println("Enter product cost= ");
      pcost=sc.nextFloat();

System.out.println("Enter product quantity = ");
      pqty=sc.nextFloat(); 

    bill=pcost*pqty;


 System.out.println("Pno = "+pno);     
 System.out.println("Pname = "+pname);
      System.out.println("Pqty = "+pqty);
System.out.println("Total amount = "+bill+ "Rs");
   
    }
  }