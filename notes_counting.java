//notes counting

import java.util.*;
class note
  {
    int r500=0,r200=0,r50=0,r20=0,r10=0,r5=0,r1=0,c=0,amt;
    note(int x)
    {
      amt=x;
    }
    void cal()
    {
      while(amt>=500)
        {
          r500=amt/500;
          amt=amt%500;
          System.out.println("500 = "+r500);
        }
      while(amt>=200)
        {
          r200=amt/200;
          amt=amt%200;
          System.out.println("200 = "+r200);
        }
      while(amt>=50)
        {
          r50=amt/50;
          amt=amt%50;
          System.out.println("50 = "+r50);
        }
      while(amt>=20)
        {
          r20=amt/20;
          amt=amt%20;
          System.out.println("20 = "+r20);
        }
      while(amt>=10)
        {
          r10=amt/10;
          amt=amt%10;
          System.out.println("10 = "+r10);
        }
      while(amt>=5)
        {
          r5=amt/5;
          amt=amt%5;
          System.out.println("5 = "+r5);
        }
      c=r500+r200+r50+r20+r10+r5;
    }
  }
class notes_counting
  {
    public static void main(String args[])
    {
      int a;
      Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amt : ");
      a=sc.nextInt();
      note am=new note(a);
      am.cal();
    }
  }