import java.util.Scanner;
public class rightAnTri {
    public static void main(String[] arStrings) {
        Scanner read=new Scanner(System.in);
        int x= read.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        read.close();
    }
}
