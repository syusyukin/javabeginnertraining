package Datatypes;
import java.util.*; 
class itterate {

    public static void main(String args[]) 
    {
        Map < String, String > stocks = new HashMap < > ();
        stocks.put("INTC","Intel");
        stocks.put("BABA","Alibaba");
        stocks.put("CVS","CVS Health");
        stocks.put("BP","British Petrolium");
        for (String key : stocks.keySet())
        {
            System.out.println(key);
        }
        Map < Integer, String > cards = new HashMap < > ();
        cards.put(1,"Pelt collector");
        cards.put(2,"Scavenging ooze");
        cards.put(3,"Questing beast");
        cards.put(4,"Forrest");
        int i = 1;
        while (i < 5)
        {
            System.out.println(cards.get(i));
            i++;
        }
    }
}
