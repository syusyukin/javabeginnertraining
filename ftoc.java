import java.util.Scanner;

public class ftoc {

    public static void main(String[] args) {

        float f, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter temperature to convert");
        f = scan.nextFloat();
        c = (f - 32) * 5 / 9;
        System.out.println(f + " degrees in Fahrenheit is " + c + " degrees in Celsius");
        scan.close();
    }
}
