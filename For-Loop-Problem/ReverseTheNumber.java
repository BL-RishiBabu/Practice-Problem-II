import java.util.Scanner;

// Program to reverse the integer number eg. Input n=231 reverse is 132

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int loopCnt = num;
        int ans = 0;

        for (int i = 0; i < loopCnt; i++){
            if (num <= 0) break;
            ans += num % 10;
            ans *= 10;
            num /= 10;
        }

        ans = ans / 10;
        System.out.println(ans);
    }    
}
