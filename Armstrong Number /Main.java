import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner s = new Scanner(System.in);
       int n= s.nextInt();
      int y=n;
      int x,v=0;
      while(n>0)
      {
        x=n%10;
        n=n/10;
        v=v+(x*x*x);
      }
      if(y==v)
      {
           System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
}
}