import java.util.*;
public class basicCalci {
    public static void main(String[] args) {
        Scanner er=new Scanner(System.in);
        System.out.println("enter 1st no.");
        int a=er.nextInt();
        System.out.println("enter 2nd no.");
        int b=er.nextInt();
        System.out.println("enter operator");
        char c= er.next().charAt(0);
        switch (c){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            case '%':System.out.println(a%b);
            break;
            default:System.out.println("Enter correct operator");
            break;
        }
        er.close();
}
}