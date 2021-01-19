package Student;
final class Mathematician extends Student implements Practice
{
    private int iq;
    
    Mathematician(String studentName, int facultyNumber)
    {
        super(studentName, facultyNumber);
        this.iq = 130;
    }
    
    Mathematician(String studentName, int facultyNumber, int iq)
    {
        super(studentName, facultyNumber);
        this.iq = iq;
    }
    
    void doMath()
    {
        System.out.println("Doing Math");
    }
    
    void setIq(int iq)
    {
        this.iq = iq;
    }
    
    int getIq()
    {
        return this.iq;
    }
    
    public void training()
    {
        System.out.println("The mathematician is solving complex mathematical problems!");
    }
}