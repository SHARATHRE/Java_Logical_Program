import java.util.*;
class currentbill
  {
    public static void main(String args[])
    {
      int cno;
      String cname;
      double pmr,lmr,tu,b;
      
      
        
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter consumer number = ");
      cno=sc.nextInt();
      System.out.println("Enter consumer name = ");
      cname=sc.next();

      System.out.println("presnt month reading= ");
      pmr=sc.nextDouble();

      System.out.println("last month reading = ");
      lmr=sc.nextDouble(); 

      

      tu=pmr-lmr;
      b=tu*3.80;


 System.out.println("Consumer no = "+cno);     
 System.out.println("Consumer name = "+cname);
 System.out.println("Present month reading = "+pmr);
 System.out.println("last month reading = "+lmr);
 System.out.println("Total units used= "+tu);
 System.out.println("Bill amount = "+b);

    }
  }