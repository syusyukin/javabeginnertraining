package Datatypes;
import java.util.*; 
class numofwords {

public static void main(String args[]) 
{
Map < String, Integer > map = new HashMap < > ();
Scanner sc = new Scanner(System.in); 
System.out.println("Enter a string:");
String sentence = sc.nextLine();
sc.close();
String[] words = sentence.split(" ");
int count = 0;
for (String oneword: words) 
{
    {
        count++;
        map.put(oneword, count); 
    } 
}

System.out.println("There are " + count + " words in the string");

}

}
