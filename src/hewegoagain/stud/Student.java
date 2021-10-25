package hewegoagain.stud;

import java.math.BigDecimal;

public class Student {
    String name;
    int age;
    BigDecimal salary;

    public Student(String name, int age, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
