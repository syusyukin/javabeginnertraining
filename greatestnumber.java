import java.util.Scanner; 

public class greatestnumber {
    public static void main(String[] args)  
    {  
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1=scan.nextInt();  
        System.out.println("Enter the second number: ");
        int number2=scan.nextInt();  
        System.out.println("Enter the third number: ");
        int number3=scan.nextInt();  
        scan.close();
        if (number1 >= number2 && number1 >= number3)
        {
            System.out.println("The greatest number is " + number1);
        }
        else if (number2 >= number1 && number2 >= number3)
        {
            System.out.println("The greatest number is " + number2);
        }
        else
        {
            System.out.println("The greatest number is " + number3);  
        }
    }
}