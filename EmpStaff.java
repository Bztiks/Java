public class EmpStaff {
    String N;
    int S;
    int Y;

    public EmpStaff(String name)
    {
        N = name;
    }

    public void EmpSalary(int Salary)
    {
        S = Salary;
    }

    public void EmpYear(int Year)
    {
        Y = Year;
    }

    public void printEmp()
    {
        System.out.println(N + S + Y);
    }
}
