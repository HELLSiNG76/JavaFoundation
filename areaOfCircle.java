import java.util.*;
public class areaOfCircle {
    public static void main(String[] aStrings) {
        Scanner ar=new Scanner(System.in);
        System.out.println("Enter radius of the circle");
        float radius=ar.nextFloat();
        double area=3.14*(Math.pow(radius, 2));
        System.out.println("Area of the given Circle is: "+area);
        ar.close();
    }
}
