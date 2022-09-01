import java.util.*;
class while_armstrong
  {
    public static void main(String args[])
    {
      int n,d,i,s=0,num;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter n value = ");
      n=sc.nextInt();
      
       for(i=1;i<=n;i++)
         {
           num=i;
            while(num>0)
             {
              d=num%10;
              s=s+d*d*d;
              num=num/10;
                if(s==num)
                  {
                   System.out.print(s);
                  }
               i++;
              }
         }
    }
  }
  
      
      
      
    
  