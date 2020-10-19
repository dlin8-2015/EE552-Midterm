import java.util.Scanner;

public class MD {
    public static void main(String[] args) {
        puzzle();
    }

    //Q2
    private static void prompt() {
        System.out.println("You need a pen and paper for this.");
        System.out.println("Write any number of multiple digits. ");
        System.out.println("Add the digits and subtract the sum of digits from the actual number. ");
        System.out.println("If you enter all but one digit of the result of subtraction (in any order), I can tell you which digit you did not enter. ");
        System.out.println("Would you like to play (Y/N)? ");
    }

    //Q3
    private static void play(int x) {
        if (x == 0) {
            prompt();
        }
        Scanner Digits = new Scanner(System.in);
        String s = Digits.nextLine();
        if (s.equalsIgnoreCase("N")) {
            System.out.println("Thanks for playing!");
            System.exit(1);
        } else if (s.equalsIgnoreCase("Y")) {
            System.out.println("Enter the resulting digits (except any one digit, which is not a 0) in any order as a number:");
            int num = Digits.nextInt();
            int num_sum = 0;
            while (num != 0) {
                num_sum += num % 10;
                num /= 10;
            }
            int remainder = num_sum % 9;
            System.out.printf("The missed digit is %d\n",  9 - remainder);
            System.out.println("Thank you for playing.");

        }
    }

     //Q4
    private static void puzzle() {
        int i = 0;
        do {
            play(i);
            System.out.println("Would you like to continue playing (Y/N)?");
            i++;
        } while (true);
    }
}