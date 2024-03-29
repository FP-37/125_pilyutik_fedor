public class Main {
    public static void main(String[] args) throws Exception {
        Student Prikolniy = new Student(19,"male","Andrey","Vesyolij",
                "Prikolovich",2,4.1);
        System.out.println(Prikolniy.getAge());
        Group Group101 = new Group(new Student[] {new Student(19,"male","Boris","Borisov",
                "Borisovich",4,3.7),
                new Student(21,"female","Anna","Samolyotova",
                        "Mikhaylovna",4,4.1),
                new Student(20,"male","Tamerlan","Berbatov",
                        "Romanovich",4,4.2)
        });
        Group101.addANewStudent();
        Group101.addANewStudent(Prikolniy);
        for (Student x: Group101.getStudents()) {
            System.out.println(x.getSurname());
        }
        Group101.deleteAStudentByNumber(1);
        Group101.deleteAStudentByNumber(0);
        //Group101.deleteAStudentByNumber(2);
        //Student Prikolniy2 = new Student(15,"male","Andrey","Vesyolij","Prikolovich",2,4.1);
        /*line 20 - Customized exception - limits of the size of the groups
        line 21 - Customized exception - limits of age*/
    }
}