import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int k = in.nextInt();
      for(int m=0;m<n-1;m++)
      {
        for(int l=0;l<n-m-1;l++)
        {
          if(a[l]>a[l+1])
          {
            int temp=a[l];
            a[l]=a[l+1];
            a[l+1]=temp;
          }
        }
      }
     int u=n-k;
      System.out.print(a[u]);
    }   
}