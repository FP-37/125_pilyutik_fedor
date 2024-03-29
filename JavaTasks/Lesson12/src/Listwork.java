import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Listwork {
    private LinkedList<Tools> someList;
    Scanner typed = new Scanner(System.in);

    public Listwork() {
        this.someList = new LinkedList<>();
    }

    public Listwork(LinkedList<Tools> someList) {
        this.someList = someList;
    }

    public void addFirstThreeElements() {
        this.someList.add(0,new Tools(1,"hummer"));
        this.someList.add(1,new Tools(2,"Screwdriver"));
        this.someList.add(2,new Tools(3,"Saw"));
    }

    public void setSomeList(LinkedList<Tools> someList) {
        this.someList = someList;
    }

    public LinkedList<Tools> getSomeList() {
        return someList;
    }

    public void addFirstAndLast() { //The user can add an item only if he has filled in the list
        System.out.println("Enter the first element: ");
        System.out.println("Size of tool: ");
        int size1 = typed.nextInt();
        typed.nextLine();
        System.out.println("Name of tool: ");
        String name1 = typed.nextLine();
        this.someList.addFirst(new Tools(size1,name1));
        System.out.println("Enter the last element: ");
        System.out.println("Size of tool: ");
        int size2 = typed.nextInt();
        typed.nextLine();
        System.out.println("Name of tool: ");
        String name2 = typed.nextLine();
        this.someList.addLast(new Tools(size2,name2));
    }

    public String getLastElement() { //To get and delete the last element, exists ".pollLast()"
        return this.someList.peekLast().getName();
    }

    public void firstPrint() {
        while (someList.size() != 0) {
            System.out.println(someList.pollFirst().getName());
        }
    }

    public void secondPrint() {
        for (int x = 0; x < someList.size(); x++) {
            System.out.println(someList.get(x).getName());
        }
    }

    public void thirdPrint() {
        for (Tools x: someList) {
            System.out.println(x.getName());
        }
    }

    public ArrayList<Tools> toArrayList() {
        ArrayList<Tools> newAList = new ArrayList<>(someList);
        return newAList;
    }
}
