import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int val=n;
        for(int r=1;r<=n;++r)
        {
          for(int c=val;c>=1;c--)
          {
            System.out.print(c);
          }
          val--;
          System.out.println();
        }
	}
}