import java.util.Scanner;

public class numbersbetweennumberswhile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1=scan.nextInt();  
        System.out.println("Enter the second number: ");
        int number2=scan.nextInt();  
        if (number1 == number2)
        {
            System.out.println("The numbers are equal");
        }
        else
        {
            while(number1 != number2)
            {
                if (number1 > number2)
                {
                    number1--;
                    if (number1 == number2)
                    {
                        break;
                    }
                    System.out.print(number1);
                }
                else 
                {
                    number1++;
                    if (number1 == number2)
                    {
                        break;
                    }
                    System.out.print(number1);
                }
            }
        }
        scan.close();
    }
}