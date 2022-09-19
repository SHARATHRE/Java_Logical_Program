//Program to find word count in a given string

import java.util.*;
class wordcount
  {
  public static void main(String args[])
  
  {
    String s;
  
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the string : ");
s=sc.nextLine();
String[] word=s.split(" ");
System.out.println("Number of words in the string are : "+word.length);
  }
  }