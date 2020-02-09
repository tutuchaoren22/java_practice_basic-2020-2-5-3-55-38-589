import model.Student;

public class Application {

    public static void main(String[] args) {
        Student stuLily = new Student("李莉",20,"女");
        System.out.println( stuLily.getName() );
        System.out.println( stuLily.getAge());
        System.out.println( stuLily.getGender());
        stuLily.study();
        stuLily.rest();

    }
}
