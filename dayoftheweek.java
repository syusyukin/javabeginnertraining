import java.util.Scanner; 

public class dayoftheweek {
    public static void main(String[] args)  
    {  
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a whole number between 1 and 7: ");
        int number=scan.nextInt(); 
        scan.close(); 
        if (number == 1)
        {
            System.out.println("It's Monday!");
        }
        else if (number == 2)
        {
            System.out.println("It's Tuesday!");
        }
        else if (number == 3)
        {
            System.out.println("It's Wednesday!");
        }
        else if (number == 4)
        {
            System.out.println("It's Thursday!");
        }
        else if (number == 5)
        {
            System.out.println("It's Friday!");
        }
        else if (number == 6)
        {
            System.out.println("It's Saturday!");
        }
        else if (number == 7)
        {
            System.out.println("It's Sunday!");
        }
        else
        {
            System.out.println("The number is not from 1 to 7");   
        }
    }
}