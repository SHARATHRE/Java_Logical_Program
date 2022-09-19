import java.util.*;
class palindrome_string
  {
    public static void main(String args[])
    {
      String s="Mom";
      String rv="";
      
      for(int i=s.length();i>0;i--)
        {
         
          rv=rv+s.charAt(i-1);
        }
      
      if(s.equals(rv))
      {
        System.out.println("The String is palindrome");
      }
        else
      {
        System.out.println("The string is not a palindrome");
      }
      }
    }
  