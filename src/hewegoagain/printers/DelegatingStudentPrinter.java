package hewegoagain.printers;

import hewegoagain.interfases.IStudentPrinter;
import hewegoagain.interfases.IStudentStringConverter;
import hewegoagain.stud.Student;

public class DelegatingStudentPrinter implements IStudentPrinter {
    private IStudentPrinter[] printers;

    public DelegatingStudentPrinter(IStudentPrinter[] printers) {
        this.printers = printers;
    }

    @Override
    public void print(Student student) {
        for (IStudentPrinter printer : printers) {
            printer.print(student);
        }
    }
}
