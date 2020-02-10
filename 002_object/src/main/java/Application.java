import model.Student;
import model.Teacher;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        Student stuLily = new Student("李莉", 20, "女");
        System.out.println(stuLily.getName());
        System.out.println(stuLily.getAge());
        System.out.println(stuLily.getGender());
        stuLily.study();
        stuLily.rest();

        Student stuWangQi = new Student("王其", 21, "男");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(stuLily);
        students.add(stuWangQi);
        Teacher teacher = new Teacher("张龙", students);
        Student stuZhaoYi = new Student("赵毅", 22, "男");
        teacher.addStudent(stuZhaoYi);
        for (Student student : teacher.getStudentList()) {
            System.out.println("学生姓名：" + student.getName() + "，年龄：" + student.getAge() + "，性别：" + student.getGender());
        }
    }
}
