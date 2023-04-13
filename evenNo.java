import java.util.*;
public class evenNo {
    public static void main(String[] aStrings) {
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        for(int i=1;i<=x;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        read.close();
    }
}