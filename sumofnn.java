
import java.util.*;
class sumofnn
  {
  public static void main(String args[])
  {
    int i,n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n = ");
    n=sc.nextInt();

    for(i=1;i<=n;i++)
      {  
      sum=sum+i;
      }
    System.out.print("The sum of n natural numbers is: "+sum);
    }
  }