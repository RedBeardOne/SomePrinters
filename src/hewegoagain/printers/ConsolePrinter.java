package hewegoagain.printers;

import hewegoagain.interfases.IStudentPrinter;
import hewegoagain.interfases.IStudentStringConverter;
import hewegoagain.stud.Student;

public class ConsolePrinter implements IStudentPrinter {
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
