import java.util.*;

public class counting {
    public static void main(String[] aStrings) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+"\t");
        }
        sc.close();
    }
}
