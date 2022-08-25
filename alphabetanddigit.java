import java.util.*;

class alphabetanddigit
  {
  public static void main(String args[])
  {
    char ch;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the character = ");
    ch = sc.next().charAt(0);
    if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') 
    {
      System.out.print("The given character is a Alphabet");
      if (ch >= 'a' && ch <= 'z')
      {
        System.out.println(" and it is a small letter");
      }
      else
      {
        System.out.println(" and it is a capital letter");
      }
    }
    else if (ch >= '0' && ch <= '9') 
    {
      System.out.println("The given character is a digit");
    } 
    else {
      System.out.println("The given character is a special character");
    }

  }
}