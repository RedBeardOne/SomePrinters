package hewegoagain.printers;

import hewegoagain.interfases.IPrinter;
import hewegoagain.stud.Student;

public class NowherePrinter implements IPrinter<Student> {

    @Override
    public void print(Student student) {
        System.out.println("nowhere");
    }
}
