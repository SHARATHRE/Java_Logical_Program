import java.util.*;
class reversen
  {
    public static void main(String args[])
    {
      String s="welcome";

      System.out.println("The reverse of the given String is:");

      for(int i=s.length();i>0;i--)
        {
          System.out.print(s.charAt(i-1));
        }
    }
  }