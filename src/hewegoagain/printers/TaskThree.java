package hewegoagain.printers;

import hewegoagain.interfases.IPrinter;
import hewegoagain.stud.Student;
import hewegoagain.stud.StudentJsonConv;
import hewegoagain.stud.StudentPrimitiveConv;
import hewegoagain.stud.StudentXmlConv;

import java.math.BigDecimal;

public class TaskThree {
    public void breeding() {
        IPrinter[] printers = new IPrinter[]{
                new ConsolePrinter(new StudentPrimitiveConv()),
                new ConsolePrinter(new StudentJsonConv()),
                new ConsolePrinter(new StudentXmlConv()),
                new NowherePrinter()};
        Student stud = new Student("Son", 32, (new BigDecimal("231231.23")));
        IPrinter printer = new DelegatingStudentPrinter(printers);
        printer.print(stud);
    }
    public void breeding(Student student) {
        IPrinter[] printers = new IPrinter[]{
                new ConsolePrinter(new StudentPrimitiveConv()),
                new ConsolePrinter(new StudentJsonConv()),
                new ConsolePrinter(new StudentXmlConv()),
                new NowherePrinter()};
        IPrinter printer = new DelegatingStudentPrinter(printers);
        printer.print(student);
    }
}
