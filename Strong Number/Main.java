import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner s = new Scanner(System.in);
       int n= s.nextInt();
      int r,su=0;
      int y=n;
       while(n>0)
       {
         r=n%10;
         su=su+fact(r);
         n=n/10;
       }
      if(y==su)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
      public static int fact(int num)
      {
        int fact=1;
        for(int j=1;j<=num;j++)
        {
          fact*=j;
        }
        return fact;
      }
}