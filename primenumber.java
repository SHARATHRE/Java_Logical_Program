import java.util.*;
class primenumber
  {
    public static void main(String args[])
    {

    int i=1,n,c=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number = ");
     n=sc.nextInt();
     while(i<=n)
       {
         if(n%i==0)
         {
           c++;
         }
             i++;
       }
      if(c==2)
      {
        System.out.println("The number is a prime number");
      }
        else
      {
          System.out.println("The number is not a prime number");
      }
      }
    
    
  }