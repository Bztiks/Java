import java.io.*;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");

        //调用成员方法
        empOne.empAge(25);
        empOne.empDesignation("高级");
        empOne.empSalary(10000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("逊");
        empTwo.empSalary(24242);
        empTwo.printEmployee();
    }
}
