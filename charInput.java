import java.util.*;
public class charInput
{
    public static void main(String[] aStrings) {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter character");
            char a=sc.next().charAt(0);
            int x=a;
            System.out.println(a+"\n"+x);
            sc.close();
    }
}