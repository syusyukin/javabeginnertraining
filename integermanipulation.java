import java.util.Scanner;

public class integermanipulation {

    public static void main(String[] args) {

        int a, b, sum, difference, product;
        Scanner scan = new Scanner(System.in);
        System.out.println("Pease input the first integer");
        a = scan.nextInt();
        System.out.println("Pease input the second integer");
        b = scan.nextInt();
        sum = a + b;
        System.out.println(" The sum is " + sum);
        difference = a - b;
        System.out.println(" The difference is " + difference);
        product = a * b;
        System.out.println(" The product is " + product);
        float ave =(float) (a + b)/2;
        System.out.println(" The average is " + ave);
        scan.close();
    }
}
