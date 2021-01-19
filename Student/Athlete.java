package Student;

final class Athlete extends Student implements Practice
{
    private int bmi;
    
    Athlete(String studentName, int facultyNumber)
    {
        super(studentName, facultyNumber);
        this.bmi = 20;
    }
    
    Athlete(String studentName, int facultyNumber, int bmi)
    {
        super(studentName, facultyNumber);
        this.bmi = bmi;
    }
    
    void doSports()
    {
        System.out.println("Doing Sports");
    }
    
    void setBmi(int bmi)
    {
        this.bmi = bmi;
    }

    int getBmi()
    {
        return this.bmi;
    }
    void takeExam()
    {
        setAttendence(true);
        System.out.println("The exam is passed!");
    }

    public void training()
    {
        System.out.println("The athlete works out!");
    }
}