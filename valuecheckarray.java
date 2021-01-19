import java.util.Scanner;
public class valuecheckarray 
{
    public static void main(String[] args) 
    {
        int count, value = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
        count = scan.nextInt();
    
        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++) 
        {
            num[i] = scan.nextInt();
        }
        int copyar[] = new int[count-1];
        System.out.println("Enter value to remove:");
        value = scan.nextInt();
        scan.close();
        for (int i = 0, j = 0; i < count; i++) 
        {
            if (value != num[i])
            {
                copyar[j++] = num[i];
            }
        }
        System.out.println();
        for (int i = 0; i < count -2; i++)
        {
            System.out.print(copyar[i]+", "); 
        }
        System.out.print(copyar[count-2]);
    }
}