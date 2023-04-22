import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Group<T> {
    private T name;
    private String study;
    private List<Student> students;

    public Group(T name, String study, List<Student> students){
        this.name = name;
        this.study = study;
        this.students = students;
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
    public void deleteStudent(String name){
        for (int i = 0; i < this.students.size(); i++) {
            if(this.students.get(i).getName().equals( name)){
                this.students.remove(i);
                break;
            }
        }
    }
    public void printGroup(){
        System.out.println("Group: " + this.name);
    }
}
