import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Store Vkusno = new Store(5,2, new Store.Goods[]
                        { new Store.Goods("Banana",5,12),
                        new Store.Goods("Apples",7,20) });
        Vkusno.setMassOfGoods();
        System.out.println("Mass of goods in Vkusno:");
        System.out.println(Vkusno.getMassOfGoods());
        System.out.println("Efficiency of desk in Vkusno:");
        System.out.println(Vkusno.efficiencyOfDesk());
        System.out.println("Efficiency of the Vkusno:");
        Vkusno.efficiency();
        Supermarket Bantik = new Supermarket(7,3,
                new Store.Goods[] { new Store.Goods("Bread",2,7) },
                17,new String[] {"Bakery", "Canned goods"});
        Bantik.setMassOfGoods();
        System.out.println("");
        System.out.println("Mass of goods in Bantik:");
        System.out.println(Bantik.getMassOfGoods());
        System.out.println("Efficiency of desk in Bantik:");
        System.out.println(Bantik.efficiencyOfDesk());
        System.out.println("Efficiency of the Bantik:");
        Bantik.efficiency();
    }
}