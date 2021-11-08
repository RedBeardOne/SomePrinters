package hewegoagain;

import hewegoagain.printers.TaskThree;
import hewegoagain.stud.Student;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("Vasya", 12, (new BigDecimal("987231.23")));
       /*  IStudentStringConverter converterJson = new StudentJsonConv();
        IStudentStringConverter converterSt = new StudentStringCinv();
        IStudentStringConverter converteXml = new StudentXmlConv();
        Student stud = new Student("Son", 32, (new BigDecimal("231231.23")));
        String convertedJs = converterJson .covert(stud);
        String conStr = converterSt.covert(stud);
        String convXml = converteXml.covert(stud);
        System.out.println(conStr);
        System.out.println(convertedJs);
        System.out.println(convXml);*/
        TaskThree taskThree = new TaskThree();
        taskThree.breeding();
        taskThree.breeding(stud1);
        List<String> list1 = new ArrayList<>();
        Collections.sort(new ArrayList<Student>(), Student.compareName());
        Collections.sort(new ArrayList<Student>(), new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int res = o1.getName().compareTo(o2.getName());
                return res;
            }
        });
        Collections.sort(new ArrayList<Student>(), new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int res = Integer.compare(o1.getAge(), o2.getAge());
                return res;
            }
        });
        Collections.sort(new ArrayList<Student>(), new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int resn = o1.getName().compareTo(o2.getName());
                if (resn ==0){  resn = Integer.compare(o1.getAge(), o2.getAge());
                    return resn; }
                else return resn;
            }
        });
    }
}
