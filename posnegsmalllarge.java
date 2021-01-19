import java.util.Scanner; 

public class posnegsmalllarge {
    public static void main(String[] args)  
    {  
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float number=scan.nextFloat(); 
        scan.close(); 
        if (number > 0f)
        {
            if (number < 1f )
            {
                System.out.println("Number is small possitive!");
            }
            else if (number > 1000000f)
            {
                System.out.println("Number is large possitive!");
            }
            else
            {
                System.out.println("Number is possitive!");
            }
        }
        else if (number < 0f)
        {
            if (number > -1f )
            {
                System.out.println("Number is small negative!");
            }
            else if (number < -1000000f)
            {
                System.out.println("Number is large negative!");
            }
            else
            {
                System.out.println("Number is negative!");
            }
        }
        else
        {
            System.out.println("Number is zero!");   
        }
    }
}