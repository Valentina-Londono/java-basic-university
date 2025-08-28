import java.util.List;

public class University {
    private List<Teacher> teachers;
    private List<Student> students;
    private List<Class> classes;

    public University(List<Teacher> teachers, List<Student> students, List<Class> classes) {
        this.teachers = teachers;
        this.students = students;
        this.classes = classes;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    public void printTeacher(){
        System.out.println("List of Teachers");
        for (Teacher t: teachers){
            System.out.println("--------------------------------------");
            t.fullPrint();
        }
    }

    public void printClasses(){
        System.out.println("List of Classes");
        for (Class c: classes){
            System.out.println("------------------------------------");
            c.print();
        }
    }

}
