import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner s = new Scanner(System.in);
       int n= s.nextInt();
      int y=n;
      for(int i=1;i<=y;i++)
      {
        if(n%i==0)
        {
          System.out.println(i);
        }
      }
	}
}