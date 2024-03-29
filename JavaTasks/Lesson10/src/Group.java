import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Group {
    private Student[] students;

    Scanner typed = new Scanner(System.in);

    public Group () {
        this.students = new Student[] {new Student(),new Student(),new Student()};
    }

    public Group (Student[] students) throws NumberOfStudentsException {
        if ((students.length<3) || (students.length>15)) {
            throw new NumberOfStudentsException("Incorrect nuber of the students!");
        }
        this.students = students;
    }

    public Student[] getStudents() { return students; }

    public void setStudents(Student[] students) throws NumberOfStudentsException {
        if ((students.length<3) || (students.length>15)) {
            throw new NumberOfStudentsException("Incorrect nuber of the students!");
        }
        this.students = students;
    }
    public void addANewStudent(Student newOne) throws NumberOfStudentsException {
        ArrayList studentsList = new ArrayList<Student>();
        for (Student everyOldElement: students) {
            studentsList.add(everyOldElement);
        }
        studentsList.add(newOne);
        if (students.length>15) {
            throw new NumberOfStudentsException("Incorrect nuber of the students!");
        }
        Student[] newArr = new Student[studentsList.size()];
        students = (Student[]) studentsList.toArray(newArr);
    }
    public void addANewStudent() throws NumberOfStudentsException,WrongAgeException {
        ArrayList studentsList = new ArrayList<Student>();
        for (Student everyOldElement: students) {
            studentsList.add(everyOldElement);
        }
        System.out.println("Enter the student's age:");
        int age = typed.nextInt();
        if ((age<16) || (age>60)) {
            throw new WrongAgeException("Age is incorrect!");
        }
        System.out.println("Enter the student's gender:");
        String gender = typed.nextLine();
        typed.nextLine();
        System.out.println("Enter the student's first name:");
        String name = typed.nextLine();
        System.out.println("Enter the student's surname:");
        String surname = typed.nextLine();
        System.out.println("Enter the student's second name:");
        String secondName = typed.nextLine();
        System.out.println("Enter the student's course:");
        int course = typed.nextInt();
        System.out.println("Enter the student's average score:");
        double averageScore = typed.nextDouble();
        Student newOne = new Student(age,gender,name,surname,secondName,course,averageScore);
        studentsList.add(newOne);
        if (studentsList.size()>15) {
            throw new NumberOfStudentsException("Incorrect nuber of the students!");
        }
        Student[] newArr = new Student[studentsList.size()];
        students = (Student[]) studentsList.toArray(newArr);
    }

    public void deleteAStudentByNumber(int number) throws NumberOfStudentsException {
        ArrayList studentsList = new ArrayList<Student>();
        for (Student everyOldElement: students) {
            studentsList.add(everyOldElement);
        }
        studentsList.remove(number);
        if (studentsList.size()<3) {
            throw new NumberOfStudentsException("Incorrect nuber of the students!");
        }
        Student[] newArr = new Student[studentsList.size()];
        students = (Student[]) studentsList.toArray(newArr);
    }
}
