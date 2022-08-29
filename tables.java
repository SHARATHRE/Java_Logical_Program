
import java.util.*;
class tables
  {
  public static void main(String args[])
  {
    int i,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the n value = ");
    n=sc.nextInt();

    for(i=1;i<=10;i++)
      {  
        
      System.out.println(n+" X "+i+" = "+(n*i));
      }
    }
  }