import java.util.*;

public class Student {
    private int age;
    private String gender;
    private String name;
    private String surname;
    private String secondName;
    private int course;
    private double averageScore;

    public Student() {
        this.age = 18;
        this.gender = "male";
        this.name = "Miroslav";
        this.surname = "Miroslavov";
        this.secondName = "Miroslavovich";
        this.course = 1;
        this.averageScore = 4.5;
    }

    public Student(int age,String gender,String name,String surname, String secondName, int course, double averageScore)
            throws WrongAgeException {
        if ((age<16) || (age>60)) {
            throw new WrongAgeException("Age is incorrect!");
        }
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.course = course;
        this.averageScore = averageScore;
    }

    public int getAge() { return age; }

    public void setAge(int age) throws WrongAgeException {
        if ((age<16) || (age>60)) {
            throw new WrongAgeException("Age is incorrect!");
        }
        this.age = age;
        }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public String getOtchestvo() { return secondName; }

    public void setSecondName(String secondName) { this.secondName = secondName; }

    public int getCourse() { return course; }

    public void setCourse(int course) { this.course = course; }

    public double getAverageScore() { return averageScore; }

    public void setAverageScore(double averageScore) { this.averageScore = averageScore; }
}