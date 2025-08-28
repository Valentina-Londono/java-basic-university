import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // * . + Teachers
        Teacher t1 = new FullTimeTeacher("Valentina Londoño", 600000, 4);
        Teacher t2 = new FullTimeTeacher("Juan David Cataño", 400000, 6);
        Teacher t3 = new PartTimeTeacher("Daniel Marquez", 100000, 24);
        Teacher t4 = new PartTimeTeacher("Joan Jaramillo", 120000, 16);

        //  List of teachers
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);

        // + . * Students
        Student s1 = new Student("Juan Marin", 1, 18);
        Student s2 = new Student("Jose Ramos", 2, 19);
        Student s3 = new Student("Kevin Gil", 3, 17);
        Student s4 = new Student("Taylor Swift", 4, 22);
        Student s5 = new Student("Sabrina Carpenter", 5, 21);
        Student s6 = new Student("Guadalupe Villalobos", 6, 24);
        Student s7 = new Student("Rick Sanchez", 7, 50);
        Student s8 = new Student("Morty Smith", 8, 14);

        // List of students
        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);

        ArrayList<Student> st1 = new ArrayList<Student>();
        st1.add(s1);
        st1.add(s2);
        st1.add(s3);
        st1.add(s4);

        ArrayList<Student> st2 = new ArrayList<Student>();
        st2.add(s5);
        st2.add(s6);
        st2.add(s7);
        st2.add(s8);

        ArrayList<Student> st3 = new ArrayList<Student>();
        st3.add(s1);
        st3.add(s6);
        st3.add(s2);
        st3.add(s8);

        // * . + Classes

        Class c1 = new Class("Art", "4A", st1, t1);
        Class c2 = new Class("Math", "6B", st2, t2);
        Class c3 = new Class("Finances", "1A", st3, t3);
        Class c4 = new Class("Programming", "2C", st1, t4);

        // List of classes
        ArrayList<Class> classes = new ArrayList<>();
        classes.add(c1);
        classes.add(c2);
        classes.add(c3);
        classes.add(c4);

        // . + * University

        University univalle = new University(teachers, students, classes);

        // * . * . + * Implementation * . - + . *
        System.out.println("Welcome to the Universidad del Valle");
        boolean exit = false;
        while (!exit) {
            System.out.println("# Select an option:\n" +
                    "1. List of teachers\n" +
                    "2. List of classes\n" +
                    "3. Create a new student\n" +
                    "4. Create a new class\n" +
                    "5. Search the classes for student\n" +
                    "6. Salir\n");

            Scanner input = new Scanner(System.in);
            int opc = input.nextInt();
            input.nextLine();

            switch (opc) {
                case 1:
                    univalle.printTeacher();
                    break;

                case 2:
                    System.out.println("Select a class to see more information");
                    univalle.printClasses();
                    int choice =  input.nextInt();
                    input.nextLine();

                    Class choiceClass = univalle.getClasses().get(choice - 1);
                    choiceClass.fullPrint();
                    break;

                case 3:
                    int id = students.size() + 1;

                    System.out.println("Student name: ");
                    String name = input.nextLine();

                    System.out.println("Student age: ");
                    int age = input.nextInt();
                    input.nextLine();

                    Student st = new Student(name, id, age);
                    students.add(st);

                    System.out.println("Choose a class to add the new student");
                    univalle.printClasses();
                    int choice2 =  input.nextInt();
                    input.nextLine();

                    Class choiceClass2 =  univalle.getClasses().get(choice2 - 1);
                    choiceClass2.getStudents().add(st);

                    System.out.println("The student has been added to the class " + choiceClass2.getName());
            }
        }

    }
}
