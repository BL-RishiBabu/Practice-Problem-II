import java.util.Scanner;

// Program for the sum of n natural numbers

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int ans = 0;

        for (int i = 0; i <= num; i++) ans += i;
        System.out.println("Sum of " + num + " Natural Number is " + ans);
    }    
}
