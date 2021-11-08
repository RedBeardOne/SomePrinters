package hewegoagain.stud;

import hewegoagain.interfases.IStudentStringConverter;

public class StudentXmlConv implements IStudentStringConverter {


    @Override
    public String covert(Student student) {
        StringBuilder build = new StringBuilder();
        build.append("<student>").append('\n');
        build.append("\t").append("<").append("name").append(">").append(student.name).append("<").append("name").append(">").append('\n');
        build.append("\t").append("<").append("age").append(">").append(student.age).append("<").append("age").append(">").append('\n');
        build.append("\t").append("<").append("salary").append(">").append(student.salary).append("<").append("salary").append(">").append('\n');
        build.append("</student>");
        return build.toString();
    }
}
