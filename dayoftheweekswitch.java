import java.util.Scanner; 

public class dayoftheweekswitch {
    public static void main(String[] args)  
    {  
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a whole number between 1 and 7: ");
        int number=scan.nextInt();  
        scan.close();
        switch(number)
        {
            case 1:
                System.out.println("It's Monday!");
                break;
            case 2:
                System.out.println("It's Tuesday!");
                break;
            case 3:
                System.out.println("It's Wednesday!");
                break;
            case 4:
                System.out.println("It's Thursday!");
                break;
            case 5:
                System.out.println("It's Friday!");
                break;
            case 6:
                System.out.println("It's Saturday!");
                break;
            case 7:
                System.out.println("It's Sunday!");
                break;
        }
        if (number>7 || number<1)
        {
            System.out.println("The number is not from 1 to 7");   
        }
    }
}