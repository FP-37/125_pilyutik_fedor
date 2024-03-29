import java.util.*;

public class Supermarket extends Store {
    private double area;
    private String[] categoriesOfGoods;

    public Supermarket(int numberOfDesks, int numberOfSalespersons, Goods[] goods, double area, String[] categoriesOfGoods) {
        this.numberOfDesks = numberOfDesks;
        this.numberOfSalespersons = numberOfSalespersons;
        this.goods = goods;
        this.area = area;
        this.categoriesOfGoods = categoriesOfGoods;
    }

    public Supermarket() {
        this.numberOfDesks = 1;
        this.numberOfSalespersons = 1;
        this.goods = new Goods[] {new Goods(),new Goods()};
        this.area = 10;
        this.categoriesOfGoods = new String[] {"Milk & Cheese","Bread & Bakery"};
    }

    public void efficiency() {
        System.out.println(((area/categoriesOfGoods.length)*efficiencyOfDesk())/(getMassOfGoods()*10));
    }

    public void setArea(double usersData) {
        area = usersData;
    }

    public void setCategoriesOfGoods (String[] usersData) {
        List categoriesList = new ArrayList(Arrays.asList(categoriesOfGoods));
        categoriesList.add(usersData);
        categoriesOfGoods = (String[]) categoriesList.toArray(categoriesOfGoods);
    }

    public double getArea() {
        return area;
    }

    public String[] getCategoriesOfGoods() { return categoriesOfGoods; }
}