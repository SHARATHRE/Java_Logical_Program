class reverse
  {
    public static void main(String args[])
    {
      String st1="welcome";
      char rc;
      String sc="";

      for(int i=7;i>=0;i--)
        {
          rc=st1.charAt(i);
          sc=sc+rc;
        }
      System.out.println(sc);
    }
  }