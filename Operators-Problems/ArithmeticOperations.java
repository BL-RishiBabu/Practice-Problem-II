import java.util.Scanner;

// Program to find minimum and maximum value of 'a + b * c', 'c + a / b', 'a % b + c' and 'a * b + c'

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double max;
        double min;

        System.out.print("Enter value of a : ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b : ");
        double b = sc.nextDouble();
        System.out.print("Enter value of c : ");
        double c = sc.nextDouble();

        double funOne = a + b * c;
        double funTwo = c + a / b;
        double funThree = a % b + c;
        double funFour = a * b + c;

        System.out.println("a + b * c = " + funOne);
        System.out.println("c + a / b = " + funTwo);
        System.out.println("a % b + c = " + funThree);
        System.out.println("a * b + c = " + funFour);

        if (funOne >= funTwo) {
            if (funOne >= funThree) {
                max = funOne >= funFour ? funOne : funFour;
            } else {
                max = funThree >= funFour ? funThree : funFour;
            }
        } else {
            if (funTwo >= funThree) {
                max = funTwo >= funFour ? funTwo : funFour;
            } else {
                max = funThree >= funFour ? funThree : funFour;
            }
        }

        if (funOne < funTwo) {
            if (funOne < funThree) {
                min = funOne < funFour ? funOne : funFour;
            } else {
                min = funThree < funFour ? funThree : funFour;
            }
        } else {
            if (funTwo < funThree) {
                min = funTwo < funFour ? funTwo : funFour;
            } else {
                min = funThree < funFour ? funThree : funFour;
            }
        }

        System.out.println("Maximum value : " + max);
        System.out.println("Minimum value : " + min);
    }    
}
