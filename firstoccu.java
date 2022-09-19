//Program to find first occurrence of the character in a string


import java.util.*;
class firstoccu
  {
    public static void main(String args[])
    {
      String s;
      char c;
      int i;
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter the the string");
      s=sc.nextLine();
      System.out.print("Enter the charracter that needed to be found : ");
      c=sc.next().charAt(0);
      i=s.indexOf(c);
      System.out.println("The first occurence of the given character in the string is "+i);
    }
  }