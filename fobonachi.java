import java.util.Scanner;

public class fobonachi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers? ");
        int N=scan.nextInt(); 
        scan.close();
        int i = 0 ;
        int number, number1 = 0, number2 = 1;
        do
        {
            if (i == 0)
            {
                System.out.print(i + ", ");
            }
            else if (i == 1)
            {
                System.out.print(i + ", ");
            }
            else
            {
                number = number1 + number2;
                number1 = number2;
                number2 = number;
            System.out.print(number + ", ");
            }
            i++;
        }
        while(i < N); 
    }
}