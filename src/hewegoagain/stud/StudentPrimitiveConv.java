package hewegoagain.stud;

import hewegoagain.interfases.IStudentStringConverter;

public class StudentPrimitiveConv implements IStudentStringConverter {
    @Override
    public String covert(Student student) {
        StringBuilder build = new StringBuilder();
        build.append("name = ").append(student.name).append('\n');
        build.append("age = ").append(student.age).append('\n');
        build.append("salary = ").append(student.salary)    ;
        return build.toString();
    }
}
