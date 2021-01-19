package Student;

class Student
{
    private String name;
    private int fNumber;
    private boolean attendence;
    Student(String studentName, int facultyNumber)
    {
        this.name = studentName;
        this.fNumber = facultyNumber;
    }

    void takeExam()
    {
        System.out.println("Taking Exam");
    }
    
    void takeExam(boolean attendence)
    {
        if (attendence == true)
        {
            System.out.println("The exam is passed!");
        }
        else 
        {
            System.out.println("The exam is failed!");
        }
    }


    void setAttendence(boolean att)
    {
        this.attendence = att;
    }

    boolean getAttendence()
    {
        return this.attendence;
    }

    void setName(String newName)
    {
        this.name = newName;
    }

    String getName()
    {
        return this.name;
    }

    void setFNumber(int newFNumber)
    {
        this.fNumber = newFNumber;
    }

    int getFNumber()
    {
        return this.fNumber;
    }

}