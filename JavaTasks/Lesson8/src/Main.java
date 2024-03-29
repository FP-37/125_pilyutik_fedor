public class Main {
    public static void main(String[] args) {
        Person Guest = new Person("Petr","Yakimanov","male",true);
        Guest.sleep();
        Guest.showInfo();
        System.out.println("");

        Employee Waitress = new Employee("Angelina","Paskal","female",true,"Waitress",
                25000,"None","Service Departament");
        Waitress.middlePosition();
        Waitress.sleep();
        Waitress.goRiseOfPayment(3000);
        Waitress.showInfo();
        Waitress.status();

        Cook Chief = new Cook("Sergey","Mamonov","male",true,
                "Cook", 50000,"2016-2021 - cook in the restaurant",
                "The Department of Food Provision","Foie Gras",5);
        System.out.println("");
        Chief.seniorPosition();
        Chief.goodCooked();
        Chief.goodCooked();
        Chief.poorlyCooked();
        Chief.showInfo();
        Chief.status();

        Confectioner Baker = new Confectioner("Mark","Gonsalez","male",true,
                "Confectioner",42000, "2019-2021 - baker in the bakery",
                "The Department of Food Provision","Rum Cake",3);
        System.out.println("");
        Baker.pieOrder();
        Baker.pieWorker();
        Baker.showInfo();
        Baker.status();

        Gardener Landscaper = new Gardener("Mike","Wazowski","male",true,"Landscaper",
                30000,"2001 - Monsters, Inc.","The Department of Gardening",
                "Flowers","Frontage");
        System.out.println("");
        Landscaper.goodJob();
        Landscaper.cutATree("oak");
        Landscaper.showInfo();
        Landscaper.status();
    }
}