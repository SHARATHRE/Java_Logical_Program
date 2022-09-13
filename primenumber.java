import java.util.*;

class primenumber
  {
  public static void main(String args[]) 
    {
    int r, n,i,j,c = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first value:");
    n = sc.nextInt();
    System.out.println("Enter second value:");
    r = sc.nextInt();
      
    for (i=n;i<=r;i++) 
    {
      c = 0;
      for (j=1;j<=i;j++) 
      {
        if (i%j == 0) 
        {
          c++;
        }
        
      }
     if(c==2)
     {
        System.out.println(i);  
    }
    }
  }
}