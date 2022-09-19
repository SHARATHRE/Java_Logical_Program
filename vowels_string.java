import java.util.*;
class vowels_string
  {
    public static void main(String args[])
    {
      String s="hello";
      int v=0;
      int c=0;
    

      for(int i=0;i<s.length();i++)
        {
          char ch=s.charAt(i);

          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
          {
            v++;
          }
          else
          {
            c++;
          }
        }
      System.out.println("\nThe number of vowels in the string are "+v);
      System.out.println("The number of consonants in the string are "+c);
    }
  }