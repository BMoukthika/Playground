import java.util.Scanner;
class Main{
   public static void r(int b)
   {
     int c=0;
     for(int y=2;y<=b;y++)
     {
       c=0;
       for(int g=1;g<=y;g++)
       {
          if(y%g==0)
          {
            c=c+1;
          }
     }
       if(c==2)
       System.out.println(y);
   }
   }
	public static void main (String[] args){
	    // Type your code here
      Scanner s =new Scanner(System.in);
      int m= s.nextInt();
      r(m);
	}
}