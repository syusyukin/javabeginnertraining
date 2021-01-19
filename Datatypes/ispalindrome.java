package Datatypes;
import java.util.*;
public class ispalindrome
{
  

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a string");
        String input = scan.nextLine();
        scan.close();
        int len = input.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = input.charAt(i);
        } 
        
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }
        
        String reverseinput = new String(charArray);
        if (input.equals(reverseinput))
        {
            System.out.println("The string is a palindrome");
        }
        else
        {
            System.out.println("The string is not a palindrome");  
        }
        
            
    }
  
}
