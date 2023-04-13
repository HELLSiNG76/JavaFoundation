import java.util.*;
public class prime {
    public static void main(String[] aStrings) {
        Scanner read = new Scanner(System.in);
        int x=read.nextInt();
        boolean y=true;
        for(int i=2;i<Math.sqrt(x);i++){
            if(x%i==0){
                y=false;
            }
        }
        System.out.println(x+" is prime: "+y);
        read.close();
    }
}
