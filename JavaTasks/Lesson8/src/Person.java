public class Person {
    protected String name;
    protected String surname;
    protected String gender;
    protected static boolean active;

    public Person () {
        this.name = "Dimitr";
        this.surname = "Berbatov";
        this.gender = "male";
        this.active = true;
    }

    public Person(String name,String surname,String gender,boolean active) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.active = active;
    }

    public void sleep() {
        if (active) { active = false; }
        else { active = true; }
    }

    public void showInfo() {
        System.out.println("Name: "+getName()+" "+getSurname());
        System.out.println("Gender: "+getGender());
        System.out.println("Is active: "+getActive());
    }

    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setGender(String gender) { this.gender = gender; }
    public void setActive(boolean active) { this.active = active; }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getGender() { return gender; }
    public boolean getActive() { return active; }
}
