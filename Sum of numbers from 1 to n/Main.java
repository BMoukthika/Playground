import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner s=new Scanner(System.in);
       int n = s.nextInt();
      int m=0;
       for(int i=0;i<=n;i++)
       {
         m=m+i;
       }
      System.out.println(m);
	}
}