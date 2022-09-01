import java.util.*;
class while_evennumb
  {
    public static void main(String args[])
    {

    int i=0,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the n even numbers = ");
     n=sc.nextInt();   
    while(i<=n)
      {
        System.out.print("\t"+i);
        i=i+2;
      }
     
      
    }
  }