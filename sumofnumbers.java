import java.util.Scanner;

public class sumofnumbers {

    public static void main(String[] args) {

        int inputnumber, hundreds, tens, ones, sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer between 0 and 1000");
        inputnumber = scan.nextInt();
        hundreds = inputnumber / 100;
        tens = (inputnumber - hundreds*100) / 10;
        ones = (inputnumber - hundreds*100 - tens*10);
        sum = hundreds + tens + ones;
        System.out.println("Sum of all digists is " + sum);
        scan.close();
    }
}
