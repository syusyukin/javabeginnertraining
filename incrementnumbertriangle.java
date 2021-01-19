import java.util.Scanner;

public class incrementnumbertriangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int number=scan.nextInt();  
        scan.close();
        int mod = 1;
        int mod2 = 1;
        for(int i = 1; i < number + 1; i++)
       {
           System.out.println();
           for( int j = mod; j < i + mod; j++)
           {
               System.out.print(j + " ");
               mod2 = j + 1;
           }
           mod = mod2 ;
       }
    }
} 