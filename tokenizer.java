import java.util.*;
class tokenizer
  {
    public static void main(String args[])
    {
      String s="hello welcome to bitlabs";
      StringTokenizer t=new StringTokenizer(s);

      System.out.println("no. of tokens in the sting " +t.countTokens());

      System.out.println("the tokens are");
      while(t.hasMoreTokens())
        {
          System.out.println(t.nextToken());
        }
    }
  }