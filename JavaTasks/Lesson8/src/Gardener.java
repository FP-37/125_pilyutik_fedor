public class Gardener extends Employee {
    private String specialization;
    private String landPlot;

    public Gardener() {
        this.name = "Dimitr";
        this.surname = "Berbatov";
        this.gender = "male";
        active = true;
        this.position = "Gardener";
        this.payment = 25000;
        this.experience = "no experience";
        this.departament = "The Department of Gardening";
        this.specialization = "Trees";
        this.landPlot = "Frontage";
    }

    public Gardener(String name,String surname,String gender,boolean active,String position,
                    int payment,String experience,String departament,String specialization,String landPlot) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.active = active;
        this.position = position;
        this.payment = payment;
        this.experience = experience;
        this.departament = departament;
        this.specialization = specialization;
        this.landPlot = landPlot;
    }

    public void setSpecialization(String specialization) { this.specialization = specialization; }
    public void setLandPlot(String landPlot) { this.landPlot = landPlot; }

    public String getSpecialization() { return specialization; }
    public String getLandPlot() { return landPlot; }

    public void showInfo() {
        System.out.println("Name: "+getName()+" "+getSurname());
        System.out.println("Gender: "+getGender());
        System.out.println("Is active: "+getActive());
        System.out.println("Position: "+getPosition());
        System.out.println("Payment: "+getPayment());
        System.out.println("Experience: "+getExperience());
        System.out.println("Departament: "+getDepartament());
        System.out.println("Specialization: "+getSpecialization());
        System.out.println("Land Plot: "+getLandPlot());
    }

    public void goodJob() {
        seniorPosition();
        this.payment += 10000;
    }

    public void cutATree(String A) {
        System.out.println("Gardener will cut this "+A+" tree!");
    }

    public void status() {
        if (active) { System.out.println("Is Cutting"); }
        else { System.out.println("Is Loafing"); }
    }
}
