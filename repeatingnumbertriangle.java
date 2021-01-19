import java.util.Scanner;

public class repeatingnumbertriangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int number=scan.nextInt(); 
        scan.close(); 
        for(int i = 0; i < number + 1; i++)
       {
           System.out.println();
           for( int j = 0; j < i; j++)
           {
               System.out.print(i);
           }
       }
    }
}