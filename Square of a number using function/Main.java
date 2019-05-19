import java.util.Scanner;
class Main
{
	 public static int m(int n)
  {
    int z=n*n; 
    return z;
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
