import java.util.Scanner;

public class numbertrianglewhile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int number=scan.nextInt(); 
        scan.close();
        int i = 1;
        while(i < number+1)
       {
           System.out.println();
           int j = 1;
           while(j < i+1)
           {
               System.out.print(j);
               j++;
           }
           i++;
       }
    }
}