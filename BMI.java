import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        float mass, height, bmi;
        Scanner scan = new Scanner(System.in);
        System.out.println("Pease input your mass in pounds");
        mass = scan.nextFloat();
        System.out.println("Pease input your height in inches");
        height = scan.nextFloat();
        scan.close();
        bmi = mass / height / height * 703f;
        System.out.println(" Your BMI is " + bmi);
    }
}
