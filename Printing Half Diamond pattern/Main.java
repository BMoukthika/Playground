import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        for(int r=1;r<=n;++r)
        {
          for(int p=1;p<=n-r;p++)
          {
            System.out.print(" ");
          }
          for(int c=1;c<=(2*r-1);++c)
          {
            System.out.print("*");
          }
          System.out.println();
        }
	}
}