package Student;

public class Main {

    public static void main(String[] args) {
        Athlete std1 = new Athlete("Will", 1326);
        System.out.println(std1.getName());
        System.out.println(std1.getFNumber());
        System.out.println(std1.getBmi());
        std1.setAttendence(false);
        std1.takeExam();
        std1.doSports();
    }
}