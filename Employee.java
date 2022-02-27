import java.io.*;
public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    
    //类构造器
    public Employee(String name){
        this.name = name;
    }

    //设置age值
    public void empAge(int empAge)
    {
        age = empAge;
    }

    //设置designation值
    public void empDesignation(String empDesig)
    {
        designation = empDesig;
    }

    //设置salary值
    public void empSalary(double empSalary)
    {
        salary = empSalary;
    }

    //ouput
    public void printEmployee()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(designation);
        System.out.println(salary);
    }
}
