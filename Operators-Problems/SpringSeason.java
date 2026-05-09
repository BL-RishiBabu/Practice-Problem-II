import java.util.Scanner;

// Program to find spring season or not

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day : ");
        int day = sc.nextInt();
        System.out.print("Enter Month : ");
        int month = sc.nextInt();

        boolean isSpring = (month == 4 || month == 5) || (month == 3 && day >= 20 && day <= 31) || (month == 6 && day <= 20 && day >= 1);
        System.out.println(isSpring);
    }    
}
