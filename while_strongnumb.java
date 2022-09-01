import java.util.*;
class while_strongnumb
  {
    public static void main(String args[])
    {
      int n,num,d,s=0,f=1;
  
Scanner sc=new Scanner(System.in);
System.out.print("Enter the digits:");
      n=sc.nextInt();
      num=n;
    while(num>0)
      {
        d=num%10;
        for( ;n>=1;n--)
        {
          f=f*n;
        }
        s=s+f;
        num=num/10;
      }
      if(s==n)
      {
        
         System.out.println("The digit is a strong number");
      }
        else
      {
        System.out.println("The digit is not strong number");
      }
     
    }
    
  }
