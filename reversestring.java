import java.util.Scanner;
public class reversestring 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String ogstring = scan.nextLine();
        scan.close();
        String newstring = "";
        int i, n = ogstring.length();
        while (ogstring.contains(" "))
        {
            i = ogstring.lastIndexOf(" ", n - 1);
            newstring += ogstring.substring(i+1,n) + " ";
            n = i ;
            ogstring = ogstring.substring(0, i);
        }
        newstring += ogstring;
        System.out.println(newstring);
    }
}