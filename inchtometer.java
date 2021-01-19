import java.util.Scanner;

public class inchtometer {

    public static void main(String[] args) {

        float i, m;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter lenght in inches");
        i = scan.nextFloat();
        scan.close();
        m = i * 0.0254f;
        System.out.println(i + " inches are equal to " + m + " meters");
    }
}
