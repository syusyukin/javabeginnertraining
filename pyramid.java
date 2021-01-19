import java.util.Scanner;

public class pyramid {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int number=scan.nextInt(); 
        scan.close(); 
        for(int i = 1; i < number + 1; i++)
       {
           System.out.println();
           for (int j=0; j < number - i; j++)
           {
                System.out.print(" ");
           }
           for( int j = 0; j < i ; j++)
           {
               System.out.print(i + " ");
           }
       }
    }
} 