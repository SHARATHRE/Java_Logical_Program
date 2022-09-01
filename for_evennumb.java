import java.util.*;
class for_evennumb
  {
    public static void main(String args[])
    {

    int i,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the n even numbers = ");
     n=sc.nextInt();   
    for(i=0;i<=n;i+=2)
      {
        System.out.print("\t"+i);
        
      }
     
      
    }
  }