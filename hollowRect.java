import java.util.*;

public class hollowRect {
    public static void main(String[] aStrings) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row and column");
        int row=sc.nextInt();
        int column=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                    if(i==1||i==row||j==1||j==column){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
            }
            System.out.println();
        }
        sc.close();
    }
}
