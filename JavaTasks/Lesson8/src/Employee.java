interface Worker {
    default void status() {
        if (Employee.active) { System.out.println("Is Working"); }
        else { System.out.println("Is Loafing"); }
    }
}

public class Employee extends Person implements Worker {
    protected String position;
    protected int payment;
    protected String experience;
    protected String departament;

    public Employee() {
        this.name = "Dimitr";
        this.surname = "Berbatov";
        this.gender = "male";
        this.active = true;
        this.position = "gardener";
        this.payment = 32000;
        this.experience = "no experience";
        this.departament = "The Department of Very Important Affairs";
    }

    public Employee(String name,String surname,String gender,boolean active,
                    String position,int payment,String experience,String departament) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.active = active;
        this.position = position;
        this.payment = payment;
        this.experience = experience;
        this.departament = departament;
    }

    public void setPosition(String position) { this.position = position; }
    public void setPayment(int payment) { this.payment = payment; }
    public void setExperience(String experience) { this.experience = experience; }
    public void setDepartament(String departament) { this.departament = departament; }

    public String getPosition() { return position; }
    public int getPayment() { return payment; }
    public String getExperience() { return experience; }
    public String getDepartament() { return departament; }

    public void showInfo() {
        System.out.println("Name: "+getName()+" "+getSurname());
        System.out.println("Gender: "+getGender());
        System.out.println("Is active: "+getActive());
        System.out.println("Position: "+getPosition());
        System.out.println("Payment: "+getPayment());
        System.out.println("Experience: "+getExperience());
        System.out.println("Departament: "+getDepartament());
    }

    public void goRiseOfPayment(int rise) { this.payment += rise; }

    public void juniorPosition() { this.position = "Junior " + this.position; }
    public void middlePosition() { this.position = "Middle " + this.position; }
    public void seniorPosition() { this.position = "Senior " + this.position; }
}
