import java.util.Scanner;

public class diamond {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int number=scan.nextInt();  
        for(int i = 1; i < number + 1; i++)
       {
           System.out.println();
           for (int j=0; j < number - i; j++)
           {
                System.out.print(" ");
           }
           for( int j = 0; j < 2* i -1; j++)
           {
               System.out.print("*");
           }
       }
        for(int i = number - 1; i > 0; i--)
        {
            System.out.println();
            for(int j = number - i; j > 0; j--)
            {
                System.out.print(" ");  
            }
            for( int j = 0; j < 2* i -1; j++)
            {
                System.out.print("*");
            }
        }
        scan.close();
    }
} 