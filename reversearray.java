import java.util.Scanner;
public class reversearray 
{
    public static void main(String[] args) 
    {
        int count;
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
        int copyar[] = new int[count];
        scan.close();
        for (int i = 0; i < count; i++) 
        {
           copyar[count - i - 1] = num[i];
        }
        System.out.println();
        for (int i = 0; i < count -1; i++)
        {
            System.out.print(copyar[i]+", "); 
        }
        System.out.print(copyar[count-1]);
    }
}