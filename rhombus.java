import java.util.*;
public class rhombus {
    public static void main(String[] aStrings) {
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=x;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        read.close();
    }
}
