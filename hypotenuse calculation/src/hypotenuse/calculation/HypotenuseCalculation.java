
package hypotenuse.calculation;

import java.util.Scanner;
public class HypotenuseCalculation {

    
    public static void main(String[] args) {

                Scanner scan=new Scanner(System.in);

        System.out.print("Please enter first side: ");
        int e=scan.nextInt();

        System.out.print("Please enter second side: ");
        int f=scan.nextInt();
        
        double hypotenuse=f*f+e*e;
        hypotenuse=Math.sqrt(hypotenuse);
        System.out.printf("\nThe hypotenuse of the triangle:%10.2f",hypotenuse);

        
        System.out.print("\nPlease enter first side: ");
        int a=scan.nextInt();

        System.out.print("Please enter second side: ");
        int b=scan.nextInt();

        System.out.print("Please enter third side: ");
        int c=scan.nextInt();
        
        int primeter=(a+b+c)/2;
        
        double area=Math.sqrt((primeter*(primeter-a)*(primeter-b)*(primeter-c)));
        System.out.printf("\nThe area of the triangle:%10.2f",area);
    }
    
}
