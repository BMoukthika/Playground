import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      int a[] = new int[x];
      for(int v=0;v<x;v++)
      {
        a[v]=in.nextInt();
      }
      int s=in.nextInt();
      for(int in1=0;in1<=x-1;in1++)
      {
        for(int in2=in1+1;in2<=x-1;in2++)
        {
          int sum1=a[in1]+a[in2];
          if(s==sum1)
          {
            System.out.println(a[in1]+", "+a[in2]);
          }
        }
      }
    }
}