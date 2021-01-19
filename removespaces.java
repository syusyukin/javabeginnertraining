import java.util.Scanner;
public class removespaces 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String ogstring = scan.nextLine();
        scan.close();
        ogstring = ogstring.replaceAll("\\s","");
        System.out.println(ogstring);    
    }
}