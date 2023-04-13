import java.util.*;
public class numPalindrome2 {
    public static void main(String[] aStrings) {
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        read.close();
    }
}
