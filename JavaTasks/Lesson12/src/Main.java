import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Listwork newList = new Listwork();
        newList.addFirstThreeElements();
        newList.addFirstAndLast();
        System.out.println("Last element:");
        System.out.println(newList.getLastElement());
        System.out.println("Names of tools in list:");
        newList.firstPrint();
        Listwork secondList = new Listwork();
        secondList.addFirstThreeElements();
        System.out.println("Names of tools in second list:");
        secondList.secondPrint();
        System.out.println("Another time:");
        secondList.thirdPrint();
        secondList.addFirstAndLast();
        ArrayList<Tools> myAL = new ArrayList<>();
        myAL = secondList.toArrayList();
        Collections.sort(myAL);
        System.out.println("Sorted by size:");
        for (Tools x: myAL) {
            System.out.println("Name: "+x.getName()+" Size: "+x.getSize());
        }
        Collections.reverse(myAL);
        System.out.println("Reversed:");
        for (Tools x: myAL) {
            System.out.println("Name: "+x.getName()+" Size: "+x.getSize());
        }
    }
}