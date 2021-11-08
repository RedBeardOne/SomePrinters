package hewegoagain.stud;

import hewegoagain.interfases.ICompare;

import java.math.BigDecimal;
import java.util.Comparator;

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

    public static Comparator<Student> compareName() {

        NameComparator name = new NameComparator();
        return name;

    }


    static class NameComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            int res = o1.name.compareTo(o2.name);
            return res;
        }
    }

    static class AgeComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            int res = Integer.compare(o1.age, o2.age);
            return res;
        }
    }

    static class NameAgeComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            int resn = o1.name.compareTo(o2.name);
            if (resn ==0){  resn = Integer.compare(o1.age, o2.age);
                return resn; }
            else return resn;
        }
    }
}
