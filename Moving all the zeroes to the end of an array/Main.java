import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in= new Scanner(System.in);
      int n=in.nextInt();
      int i,c=0;
      int a[] = new int[n];
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      for(i=0;i<n;i++)
      {
        if(a[i]==0)
        {
          c++;
        }
      }
      for(i=0;i<n;i++)
      {
        if(a[i]!=0)
        {
          System.out.print(a[i]+" ");
        }
      }
      for(i=0;i<c;i++)
      {
        System.out.print(0+" ");
      }
    }
}