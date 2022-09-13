import java.util.Scanner;
class hallow
{
  public static void main(String args[])
  {
    int i,j,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the shape : ");
    n=sc.nextInt();

    for(i=1;i<=n;i++)
      {
        for(j=1;j<=n;j++)
          {
            if(i==1 || i==n)
            {
              System.out.print("*");
            }
            else
            {
              if(j==1 || j==n)
              {
                System.out.print("*");
              }
              else
              {
                System.out.print(" ");
              }
            }
          }
        System.out.println();
      }
  }
}
