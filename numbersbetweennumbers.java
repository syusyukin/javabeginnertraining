import java.util.Scanner;

public class numbersbetweennumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1=scan.nextInt();  
        scan.close();
        System.out.println("Enter the second number: ");
        int number2=scan.nextInt();  
        if (number1 == number2)
        {
            System.out.println("The numbers are equal");
        }
        else if (number1 < number2)
        {
        for (int i = number1 + 1 ; i < number2; i++)
        {
            System.out.print(i + ", ");
        }
        }
        else 
        for (int i = number1 - 1 ; i > number2; i--)
        {          
              System.out.print(i + ", ");
        }
    }
}