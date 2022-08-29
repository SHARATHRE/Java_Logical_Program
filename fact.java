
import java.util.*;
class fact
  {
  public static void main(String args[])
  {
    int i,n,fact=1;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n = ");
    n=sc.nextInt();

    for(i=1;i<=n;i++)
      {  
       fact=fact*i;
      }
    System.out.print("The factorial of the number " +n+ " is : "+fact);
    }
  }