import java.util.Scanner;

class currentbillupdated {
  public static void main(String args[]) {
    int cno;
    String cname;
    double tu, pmr, lmr,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("The consumer number is:");
    cno = sc.nextInt();
    System.out.println("The consumer name is:");
    cname = sc.next();
    System.out.println("the present month reading is:");
    pmr = sc.nextDouble();
    System.out.println("the last month reading is:");
    lmr = sc.nextDouble();
    tu=pmr-lmr;
    
    
    System.out.println("the consumer number is:" +cno);
    System.out.println("the consumer name is:" +cname);
    System.out.println("the present month reading is:" +pmr);
    System.out.println("the last month reading is:" +lmr);
    System.out.println("the total units is:" +tu);

    if (tu>=1&&tu<=50)
    {
      b=tu*3.40;
      
    } 
    else if (tu>=51&&tu<=100) 
    {
      b = 50*3.40+(tu - 50)*4.56;
      
    } 
    else if (tu>=101&&tu<=200)
    {
      b = 50*3.40+50*4.56+(tu-100)*5.43;
     
    }
    else if (tu>=201&&tu<=300) 
    {
      b = 50*3.40+50*4.56+100*5.43+(tu-200)*6.54;
     
    } 
    else if (tu>300) 
    {
      b = 50*3.40+50*4.56+100*5.43+200*6.54+(tu-300)*7.54;
      
    } 
    else
    {
      System.out.println("Invalid ");
    }
    System.out.println("the current bill is:" +b);
  }
}