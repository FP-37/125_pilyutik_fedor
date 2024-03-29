import java.util.*;

public class Store {
    protected int numberOfDesks;
    protected int numberOfSalespersons;
    protected Goods[] goods;
    protected double massOfGoods;

    public Store(int numberOfDesks,int numberOfSalespersons, Goods[] goods) {
        this.numberOfDesks = numberOfDesks;
        this.numberOfSalespersons = numberOfSalespersons;
        this.goods = goods;
    }

    public Store() {
        this.numberOfDesks = 1;
        this.numberOfSalespersons = 1;
        this.goods = new Goods[] {new Goods(),new Goods()};
    }

    public void setMassOfGoods() {
        massOfGoods = 0;
        for (int i = 0; i < goods.length; i++) {
            massOfGoods += goods[i].getWeight();
        }
    }

    public void setNumberOfDesks(int usersData) { numberOfDesks = usersData; }

    public void setNumberOfSalespersons(int usersData) { numberOfSalespersons = usersData; }

    public void setGoods(Goods[] usersData) { goods = usersData; }

    public int getNumberOfDesks() { return numberOfDesks; }

    public int getNumberOfSalespersons() { return numberOfSalespersons; }

    public Goods[] getGoods() { return goods; }

    public double getMassOfGoods() { return massOfGoods; }

    public void efficiency() {
        System.out.println(efficiencyOfDesk()/midOfMass());
    }

    public double efficiencyOfDesk() {
        return ((double) getNumberOfSalespersons())/((double) getNumberOfDesks());
    }

    public double midOfMass() {
        return massOfGoods/goods.length;
    }

    public static class Goods {
        private String name;
        private double weight;
        private double price;

        public Goods(String name, double weight, double price) {
            this.name = name;
            this.weight = weight;
            this.price = price;
        }

        public Goods() {
            this("Potato",1,1);
        }

        public void setName(String userData) { this.name = userData; };

        public void setWeight(double userData) {
            this.weight = userData;
        }

        public void setPrice(double userData) { this.price = userData; }

        public String getName() { return name; }

        public double getWeight() { return weight; }

        public double getPrice() { return price; }
    }
}