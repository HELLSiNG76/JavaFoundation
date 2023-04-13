import java.util.*;
public class countTri{
    public static void main(String[] aStrings) {
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        int count=1;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+++" ");
            }
            System.out.println();
        }
        read.close();
    }
}
