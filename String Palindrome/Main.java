import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
       String s = in.nextLine();
      int l =s.length();
       StringBuffer st = new StringBuffer(s);
       StringBuffer tem = new StringBuffer("");
      int j=0;
       for(int i=l-1;i>=0;i--)
       {
         tem.append(s.charAt(i));
       }
        String tr=tem.toString();
        if(s.equals(tr))
          System.out.print("Yes");
        else
          System.out.print("No");
    } 
}