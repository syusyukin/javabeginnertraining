import java.util.Scanner;

public class minutesintoyearanddays {

    public static void main(String[] args) {

        int minutes, days, years;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter minutes to be converted");
        minutes = scan.nextInt();
        scan.close();
        years = minutes / 525600;
        days = (minutes - years*525600)/1440;
        System.out.println(minutes + " Minutes is approximately " + years +" years and " + days + " days" );
    }
}
