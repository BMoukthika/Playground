import java.util.Scanner;
class Main{
  public static int c(int a,int b,int c){
    int r=0,l=0;
    if(a>b)
    {
      r=a;
    }
    else
    {
      r=b;
    }
    if(r>c)
    {
      l=r;
    }
    else
    {
      l=c;
    }
    return l;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner s= new Scanner(System.in);
      int r= s.nextInt();
      int r1= s.nextInt();
      int r2= s.nextInt();
      int r3=c(r,r1,r2);
      System.out.println(r3);
	}
}