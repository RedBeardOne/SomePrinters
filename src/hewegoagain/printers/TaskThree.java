package hewegoagain.printers;

import hewegoagain.interfases.IStudentPrinter;
import hewegoagain.stud.Student;
import hewegoagain.stud.StudentJsonConv;
import hewegoagain.stud.StudentPrimitiveConv;
import hewegoagain.stud.StudentXmlConv;

import java.math.BigDecimal;

public class TaskThree {
    public void breeding() {
        IStudentPrinter[] printers = new IStudentPrinter[]{
                new ConsolePrinter(new StudentPrimitiveConv()),
                new ConsolePrinter(new StudentJsonConv()),
                new ConsolePrinter(new StudentXmlConv()),
                new NowherePrinter()};
        Student stud = new Student("Son", 32, (new BigDecimal("231231.23")));
        IStudentPrinter printer = new DelegatingStudentPrinter(printers);
        printer.print(stud);
    }
    public void breeding(Student student) {
        IStudentPrinter[] printers = new IStudentPrinter[]{
                new ConsolePrinter(new StudentPrimitiveConv()),
                new ConsolePrinter(new StudentJsonConv()),
                new ConsolePrinter(new StudentXmlConv()),
                new NowherePrinter()};
        IStudentPrinter printer = new DelegatingStudentPrinter(printers);
        printer.print(student);
    }
}
