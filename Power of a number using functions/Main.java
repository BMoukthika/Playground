import java.util.Scanner;
class Main{
   public static int r(int b,int e)
   {
     int s=1;
     for(int y=1;y<=e;y++)
     {
       s=s*b;
     }
     return s;
   }
	public static void main (String[] args){
	    // Type your code here
      Scanner s =new Scanner(System.in);
      int m= s.nextInt();
      int n= s.nextInt();
      int t = r(m,n);
      System.out.println(t);
	}
}