import java.util.*;
public class zeroOne {
    public static void main(String[] aStrings) {
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                System.out.print(1);
            }
            else{
                System.out.print(0);
            }
        }
            System.out.println();
        }
        read.close();
    }
}
