package hewegoagain.stud;

import hewegoagain.interfases.IStudentStringConverter;

public class StudentJsonConv implements IStudentStringConverter {
    @Override
    public String covert(Student student) {
        StringBuilder build = new StringBuilder();
        build.append("{").append('\n');
        build.append("\t").append("\"").append("name").append("\"").append(":").append("\"").append(student.name).append("\"").append(",").append('\n');
        build.append("\t").append("\"").append("age").append("\"").append(":").append(student.age).append(",").append('\n');
        build.append("\t").append("\"").append("salary").append("\"").append(":").append(student.salary).append('\n');
        build.append("}");
        return build.toString();
    }
}
