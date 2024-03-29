package unit2.pj24;

import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    private String name;
    private double salary;
    private int age;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
                + ", age=" + age + "]";
    }
    public Employee(int id, String name, double salary, int age) {
        super();
//this.id = id;
        setId(id);
//this.name = name;
        setName(name);
//this.salary = salary;
        setSalary(salary);
//this.age = age;
        setAge(age);
    }
    public void setName(String name) {
        this.name = name;
    }



    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
