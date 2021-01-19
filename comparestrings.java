import java.util.Scanner;
public class comparestrings 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firststring = scan.nextLine();
        System.out.print("Enter the second string: ");
        String secondstring = scan.nextLine();
        scan.close();
        if(firststring.length() > secondstring.length())
        {
            System.out.println("The first string is larger!");
        }
        else if (firststring.length() < secondstring.length())
        {
            System.out.println("The second string is larger!");
        }
        else 
        {
            System.out.println("The strings are with equal lenght!");
        }
    
    }
}