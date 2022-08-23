import java.util.*;
class vowel
  {
    public static void main(String args[])
    {
      char ch;
      
      Scanner sc=new Scanner(System.in);
      
      System.out.print("Enter the character = ");
      ch=sc.next().charAt(0);
      
      
    
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    {
      System.out.println("the charcter is a vowel");
    }
      else
    {
      System.out.println("the character is a consonant");
    }
      
  }
}