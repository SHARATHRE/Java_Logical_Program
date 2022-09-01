
import java.util.*;
class factV2
  {
  public static void main(String args[])
  {
    int i,n,fact=1;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of n = ");
    n=sc.nextInt();

    for(i=n;i<=n&&i>=1;i--)
      {  
       fact=fact*i;
      }
    System.out.print("The factorial of the number " +n+ " is : "+fact);
    }
  }

