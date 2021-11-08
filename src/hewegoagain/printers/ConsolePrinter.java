package hewegoagain.printers;

import hewegoagain.interfases.IPrinter;
import hewegoagain.interfases.IStudentStringConverter;
import hewegoagain.stud.Student;

public class ConsolePrinter implements IPrinter<Student> {
    private IStudentStringConverter converter;

    public ConsolePrinter(IStudentStringConverter converter) {
        this.converter = converter;
    }

    @Override
    public void print(Student student) {
        String convert = converter.covert(student);
        System.out.println(convert);
    }
}
