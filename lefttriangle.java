import java.util.Scanner;
class lefttriangle
{
  public static void main(String args[])
  {
    int i,j,n;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the shape : ");
    n=sc.nextInt();

    for(i=1;i<=n;i++)
      {
        for(j=1;j<=n-i;j++)
          {
            System.out.print("*");
          }
        System.out.println();
      }
  }
}
        