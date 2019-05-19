import java.util.Scanner;
class Main{
	 public static int m(int n)
  {
    int a=0;
    for(int j=0;j<=n;j++)
       {
         a=a+j;
       }
    return a;
  }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner u = new Scanner(System.in);
      int y = u.nextInt();
      int r = m(y);
      System.out.println(r);
	} 
}