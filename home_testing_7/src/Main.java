import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Student> array_students = new ArrayList<>(0);
        Group<Integer> group_123 = new Group<>(123, "Math", array_students);
        group_123.addStudent(new Student("Lily", 18, "VUZ", 5.0, "math" ));
        group_123.printGroup();

        LinkedList<Student> linked_students = new LinkedList<>();
        Group<String> group_s123 = new Group<>("gr123", "Info", linked_students);
        group_s123.addStudent(new Student("Name", 18, "VUZ", 5.0, "info"));
        group_s123.printGroup();
    }
}