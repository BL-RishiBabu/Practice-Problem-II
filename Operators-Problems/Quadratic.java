import java.util.Scanner;

// To calculate the roots of a quadratic equation, we use the discriminant ($\Delta = b^2 - 4ac$) to determine the nature of the roots.

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c);

        if (delta >= 0) {
            double sqrtDelta = Math.sqrt(delta);
            
            double root1 = (-b + sqrtDelta) / (2 * a);
            double root2 = (-b - sqrtDelta) / (2 * a);

            System.out.println("\n--- Roots Found ---");
            System.out.println("Root 1 of x = " + root1);
            System.out.println("Root 2 of x = " + root2);
        } else {
            System.out.println("\nRoots are imaginary (complex).");
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-delta) / (2 * a);
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}