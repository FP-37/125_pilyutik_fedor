public class Cook extends Employee {
    private String bestDish;
    private int numberOfDishes;

    public Cook() {
        this.name = "Dimitr";
        this.surname = "Berbatov";
        this.gender = "male";
        active = true;
        this.position = "Cook";
        this.payment = 32000;
        this.experience = "no experience";
        this.departament = "The Department of Food Provision";
        this.bestDish = "Curry";
        this.numberOfDishes = 5;
    }

    public Cook(String name,String surname,String gender,boolean active,String position,
                int payment,String experience,String departament,String bestDish,int numberOfDishes) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.active = active;
        this.position = position;
        this.payment = payment;
        this.experience = experience;
        this.departament = departament;
        this.bestDish = bestDish;
        this.numberOfDishes = numberOfDishes;
    }

    public void setBestDish(String bestDish) { this.bestDish = bestDish; }
    public void setNumerOfDishes(int numerOfDishes) { this.numberOfDishes = numberOfDishes; }

    public String getBestDish() { return bestDish; }
    public int getNumerOfDishes() { return numberOfDishes; }

    public void showInfo() {
        System.out.println("Name: "+getName()+" "+getSurname());
        System.out.println("Gender: "+getGender());
        System.out.println("Is active: "+getActive());
        System.out.println("Position: "+getPosition());
        System.out.println("Payment: "+getPayment());
        System.out.println("Experience: "+getExperience());
        System.out.println("Departament: "+getDepartament());
        System.out.println("Best dish: "+getBestDish());
        System.out.println("Number of dishes: "+getNumerOfDishes());
    }

    public void poorlyCooked() {
            System.out.println("What a disgusting thing is this your aspic fish!");
            this.payment -= 1000;
    }

    public void goodCooked() {
        System.out.println("The cook will be delighted!");
        this.payment += 1000;
    }

    public void status() {
        if (active) { System.out.println("Is Cooking"); }
        else { System.out.println("Is Loafing"); }
    }
}
