import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    int i;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    int max=a[0];
    for(i=0;i<n;i++)
    {
      if(max<a[i])
      {
        max=a[i];
      }
    }
    for(i=0;i<n;i++)
    {
      if(max==a[i])
        System.out.print(i);
    }
  }
}