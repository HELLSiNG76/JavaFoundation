import java.util.*;

public class table {
    public static void main(String[] argStrings) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
        sc.close();
    }
}
