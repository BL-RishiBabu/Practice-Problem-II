import java.util.Scanner;

// Program to find Palindrome Number

public class FindPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int loopCnt = num;
        int revNum = 0;

        for (int i = 0; i < loopCnt; i++){
            if (num <= 0) break;
            revNum += num % 10;
            revNum *= 10;
            num /= 10;
        }

        revNum = revNum / 10;
        System.out.println(loopCnt == revNum ? "It is a palindrome" : "It is not a palindrome");
    }
}
