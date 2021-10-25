package hewegoagain;

import hewegoagain.printers.TaskThree;
import hewegoagain.stud.Student;
import java.math.BigDecimal;

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


    }
}
