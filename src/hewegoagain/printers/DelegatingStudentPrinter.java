package hewegoagain.printers;

import hewegoagain.interfases.IPrinter;
import hewegoagain.stud.Student;

public class DelegatingStudentPrinter implements IPrinter<Student> {
    private IPrinter[] printers;

    public DelegatingStudentPrinter(IPrinter[] printers) {
        this.printers = printers;
    }

    @Override
    public void print(Student student) {
        for (IPrinter printer : printers) {
            printer.print(student);
        }
    }
}
