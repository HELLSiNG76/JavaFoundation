import java.util.*;
public class rightAnNumTri {
    public static void main(String[] aStrings) {
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        read.close();
    }
}
