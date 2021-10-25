package hewegoagain.printers;

import hewegoagain.interfases.IStudentPrinter;
import hewegoagain.stud.Student;

public class NowherePrinter implements IStudentPrinter {


    @Override
    public void print(Student student) {
        System.out.println("nowhere");
    }
}
