import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int l = sb.length();
      int f[] = new int[70];
      for(int i=0;i<l;i++)
      {
        if(sb.charAt(i)>='A' && sb.charAt(i)<='Z')
        {
          int os = sb.charAt(i)-'A';
          char ch = (char)('a'+os);
          sb.setCharAt(i,ch);
        }
        if(sb.charAt(i)>='a'&& sb.charAt(i)<='z')
        {
          f[sb.charAt(i)-'a']++;
        }
        }
       for(int i=0;i<l;i++)
       {
         if(f[sb.charAt(i)-'a']!=0)
         {
           System.out.print(sb.charAt(i)+""+f[sb.charAt(i)-'a']+" ");
           f[sb.charAt(i)-'a']=0;
         }
       }
    }
}