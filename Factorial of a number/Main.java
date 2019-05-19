import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner s = new Scanner(System.in);
       int n= s.nextInt();
      int sd=1;
       for(int i=1;i<=n;i++)
       {
         sd=sd*i;
       }
      System.out.println(sd);
	}
}