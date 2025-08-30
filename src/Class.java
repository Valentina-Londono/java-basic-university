import java.util.List;

public class Class {
    public String name;
    public String classroom;
    private List<Student> students;
    private Teacher teacher;

    public Class(String name, String classroom, List<Student> students, Teacher teacher) {
        this.name = name;
        this.classroom = classroom;
        this.students = students;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void print(){
        System.out.println("Class Name: " + this.name + "\n" + "   Classroom: " + this.classroom);
    }

    public void fullPrint(){
        System.out.println("------------------------------------------------------");
        System.out.println("Class Name: " + this.name + "  |  " + " Classroom: " + this.classroom);
        System.out.print("Assigned Teacher ");
        getTeacher().print();
        System.out.println("------------------------------------------------------");
        for (Student s: students){
            s.print();
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Total Students: " + students.size());
        System.out.println("------------------------------------------------------\n");
    }
}
