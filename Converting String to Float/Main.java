import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String s=in.nextLine();
    int l=s.length();
    double adec=0;
    double bdec=0;
    int flag=0;
    for(int i=0;i<l;i++)
    {
     if(s.charAt(i)=='.')
       flag=1;
    }
    if(flag==1)
    {
      for(int i=l-1;s.charAt(i)!='.'&&i>=0;i--)
      {
        adec=adec/10+(s.charAt(i)-'0');
      }
      adec=adec/10;
      for(int i=0;s.charAt(i)!='.';i++)
      {
       bdec=bdec*10+(s.charAt(i)-'0');
      }
    }
    else
    {
      for(int i=0;i<l;i++)
      {
       bdec=bdec*10+(s.charAt(i)-'0'); 
      }
    }
    double sum=(adec+bdec);
    System.out.printf("%.6f",sum);
  }
}