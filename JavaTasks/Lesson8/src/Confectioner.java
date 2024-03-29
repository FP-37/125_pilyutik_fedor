public class Confectioner extends Employee {
    private String bestPastries;
    private int numberOfDesk;

    public Confectioner() {
        this.name = "Dimitr";
        this.surname = "Berbatov";
        this.gender = "male";
        active = true;
        this.position = "Confectioner";
        this.payment = 32000;
        this.experience = "no experience";
        this.departament = "The Department of Food Provision";
        this.bestPastries = "Cupcakes";
        this.numberOfDesk = 1;
    }

    public Confectioner(String name,String surname,String gender,boolean active,String position,
                        int payment,String experience,String departament,String bestPastries,int numberOfDesk) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.active = active;
        this.position = position;
        this.payment = payment;
        this.experience = experience;
        this.departament = departament;
        this.bestPastries = bestPastries;
        this.numberOfDesk = numberOfDesk;
    }

    public void setBestPastries(String bestPastries) { this.bestPastries = bestPastries; }
    public void setNumberOfDesk(int numberOfDesk) { this.numberOfDesk = numberOfDesk; }

    public String getBestPastries() { return bestPastries; }
    public int getNumberOfDesk() { return numberOfDesk; }

    public void showInfo() {
        System.out.println("Name: "+getName()+" "+getSurname());
        System.out.println("Gender: "+getGender());
        System.out.println("Is active: "+getActive());
        System.out.println("Position: "+getPosition());
        System.out.println("Payment: "+getPayment());
        System.out.println("Experience: "+getExperience());
        System.out.println("Departament: "+getDepartament());
        System.out.println("Best pastries: "+getBestPastries());
        System.out.println("Number of desk: "+getNumberOfDesk());
    }


    public void pieOrder() {
        System.out.println("The confectioner has to bake a pie!");
    }

    public void pieWorker() {
        System.out.println("The confectioner turned into a pie himself:(");
        this.position = "Pie";
    }

    public void status() {
        if (active) { System.out.println("Is Baking"); }
        else { System.out.println("Is Loafing"); }
    }
}
