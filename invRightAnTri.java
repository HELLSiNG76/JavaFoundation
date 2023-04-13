import java.util.Scanner;
public class invRightAnTri {
    public static void main(String[] aStrings) {
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        read.close();
    }
}
