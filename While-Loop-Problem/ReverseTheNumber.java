import java.util.Scanner;

// Program to reverse the integer number eg. Input n=231 reverse is 132

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;

        while (num > 0) {
            ans += num % 10;
            ans *= 10;
            num /= 10;
        }

        ans = ans / 10;

        System.out.println(ans);
    }    
}
