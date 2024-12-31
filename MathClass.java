import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
            // double x=10.3232;
            // double y= -10;

            // double z=   Math.max(x, y);
            // System.out.println("Max is: "+z);
            // z=   Math.min(x, y);
            // System.out.println("Min is: "+z);
            // z=   Math.abs(y);
            // System.out.println("absolute value of y is "+z);
            // z=   Math.sqrt(x);
            // System.out.println("Sqaure root of x is "+z);
            // z=   Math.round(x);
            // System.out.println("Round of x is "+z);
            // z=   Math.ceil(x);
            // System.out.println("Ceil of x is "+z);


            double x;
            double y;
            double z;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter First Side:");
            x= scanner.nextDouble();
            System.out.println("Enter Second Side:");
            y= scanner.nextDouble();
            
            z=Math.sqrt((x*x)+(y*y));

            System.out.println("hypotenuse is "+z);
            scanner.close();



    }    
}
