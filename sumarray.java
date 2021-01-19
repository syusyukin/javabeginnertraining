import java.util.Scanner;
public class sumarray 
{
    public static void main(String[] args) 
    {
    	int count, sum = 0;
    	//User inputs the array size
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
        count = scan.nextInt();
    
        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++) 
        {
            num[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < count; i++) 
        {
            sum += num[i];
        }
        System.out.print("Sum of the array elements is: " + sum);
    }
}