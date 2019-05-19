import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      int r=0;
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);
        StringBuilder temp = new StringBuilder("");
        StringBuilder temp1 = new StringBuilder("");
        int sb1_len = sb1.length();
        int sb2_len = sb2.length();
        for(int idx = 0; idx <= (sb1_len -1); idx++){
            char ch = sb1.charAt(idx);
            temp.append(ch);     
        }
        for(int idx = 0; idx <= (sb1_len -1); idx++){
            char ch = sb1.charAt(idx);
            temp.append(ch);     
        }
        int temp_len = temp.length();
        for(int u = 0;u<temp_len;u++)
        {
          char ch = temp.charAt(u);
          if(ch== sb2.charAt(0))
          {
            r=u;
            break;
          }
        }
      int mn=r+sb2_len;
        for(int p=r;p<mn;p++)
        {
          char l = temp.charAt(p);
          temp1.append(l);
        }
      String h=temp1.toString();
      if(h.equals(str2))
      {
        System.out.print("Yes");
      }
      else
        System.out.print("No");
    }
}