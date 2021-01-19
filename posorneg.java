import java.util.Scanner; 

public class posorneg {
    public static void main(String[] args)  
    {  
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=scan.nextInt();  
        scan.close();
        if (number > 0)
        {
            System.out.println("Number is possitive!");
        }
        else if (number < 0)
        {
            System.out.println("Number is negative!");
        }
        else
        {
            System.out.println("Number is zero!");   
        }
    }
}