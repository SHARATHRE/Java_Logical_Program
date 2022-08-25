import java.util.*;
class vandc
  {
    public static void main(String args[])
    {
      char ch;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the Character = ");
      ch=sc.next().charAt(0);
       
      
    if(ch=='a'||ch=='A')
    {
        System.out.println("The character is a vowel");
    }
      else if(ch=='e'||ch=='E')
      {
        System.out.println("The character is a vowel");
      }
      else if(ch=='i'||ch=='I')
      {
          System.out.println("The character is a vowel");
      }
       else if(ch=='o'||ch=='O')
      {
          System.out.println("The character is a vowel");
      }
       else if(ch=='u'||ch=='U')
      {
          System.out.println("The character is a vowel");
      }
       else
      {
          System.out.println("The character is a consonant");
      }
  }
}