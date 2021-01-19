package Datatypes;
import java.util.*;
public class reversestring {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a string");
        String input = scan.nextLine();
        scan.close();
        char[] help = input.toCharArray();
        ArrayList<Character> trial1 = new ArrayList<>();
 
        for (char c : help)
            {
                trial1.add(c);
            }
        Collections.reverse(trial1);
        ListIterator<Character> li = trial1.listIterator();
        while (li.hasNext())
        {
            System.out.print(li.next());
        }
    }
}