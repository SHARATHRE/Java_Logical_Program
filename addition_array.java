import java.util.*;
class addition_array
  {
    public static void main(String args[])
    {
      int i,j,r1,c1,r2,c2;
      Scanner sc=new Scanner(System.in);
      
      System.out.print("Enter the fist matrix row size : ");
      r1=sc.nextInt();
      System.out.print("Enter the first matrix column size : ");
      c1=sc.nextInt();
     
      
      System.out.print("Enter the second matrix row size : ");
      r2=sc.nextInt();
      System.out.print("Enter the second matrix column size : ");
      c2=sc.nextInt();
      
      if(r1==r2&&c1==c2)
      {
      int a[][]=new int[r1][c1];
      int b[][]=new int[r1][c2];
      int c[][]=new int[r1][c2];
        
      System.out.println("Enter the array elements for first matrix :");
        for(i=0;i<r1;i++)
          {
          for(j=0;j<c1;j++)
            {
              a[i][j]=sc.nextInt();
            }
          }
        
     System.out.println("Enter the array elements for second matrix :");
        for(i=0;i<r2;i++)
          {
          for(j=0;j<c2;j++)
            {
              b[i][j]=sc.nextInt();
            }
          }
        
        for(i=0;i<r1;i++)
          {
          for(j=0;j<c1;j++)
            {
              c[i][j]=a[i][j]+b[i][j];
            }
          }
        
        System.out.println("The first matrix is");
        for(i=0;i<r1;i++)
          {
          for(j=0;j<c1;j++)
            {
              System.out.print(" "+a[i][j]);
            }
            System.out.println();
          }
        
        System.out.println("The second matrix is");
        for(i=0;i<r2;i++)
          {
          for(j=0;j<c2;j++)
            {
              System.out.print(" "+b[i][j]);
            }
            System.out.println();
          }
        
        System.out.println("The addition of both the matrix is");
        for(i=0;i<r1;i++)
          {
          for(j=0;j<c1;j++)
            {
              System.out.print(" "+c[i][j]);
            }
            System.out.println();
          }
      }
      else
      {
        System.out.println("\nThe rows and columns of matrix one and two does not match");
      }

      
    
      
      

      
    }
  }
  