public class getSalary {
    public static void main(String[] args) {
        Salary sa = new Salary();
        sa.Salary("北褶", 19, 180, 8000);
        System.out.print(sa.toString());
    }
}

class Salary{
    String n;
    int a;
    int h;
    int s;

    void Salary(String name,int age,int height,int Salary)
    {
        n = name;
        a = age;
        h = height;
        s = Salary;
    }

    String ouput(){
        return n + a + h + s;
    }

    public String toString()
    {
        return n + a + h + s;
    }

    public String setname(String name)
    {
        return name = n;
    }



}
