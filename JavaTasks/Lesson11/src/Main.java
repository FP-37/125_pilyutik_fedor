import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner typed = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int listLength = typed.nextInt();
        final int[] numbers = new int[listLength];

        Thread firstFlow = new Thread() {
            @Override
            public void run() {
                for (int x = 0; x<numbers.length; x++) {
                    System.out.println("Enter the number in cell #" + x);
                    numbers[x] = typed.nextInt();
                }
            }
        };
        Thread secondFlow = new Thread() {
            @Override
            public void run() {
                try {
                    File file = new File("src\\numbers.txt");
                    Scanner reader = new Scanner(file);
                    BufferedWriter fr = new BufferedWriter(new FileWriter(file));
                    for (int x: numbers) {
                        System.out.println(x);
                        fr.write(Integer.toString(x));
                        fr.newLine();
                    }
                    fr.close();
                }
                catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thirdFlow = new Thread() {
            @Override
            public void run() {
                ArrayList listOfNumbers = new ArrayList<Integer>();
                for (int x: numbers) {
                    listOfNumbers.add(x);
                }
                Collections.sort(listOfNumbers);
                int numbersMax = (int) listOfNumbers.get(listOfNumbers.size()-1);
                int numbersMin = (int) listOfNumbers.get(0);
                int numbersSum = 0;
                for (int x = 0; x < listOfNumbers.size(); x++) {
                    numbersSum += (int) listOfNumbers.get(x);
                }
                System.out.println("Max: " + numbersMax + " Min: " + numbersMin + " Sum: " + numbersSum);
            }
        };

        firstFlow.start();
        try {
            firstFlow.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        secondFlow.start();
        thirdFlow.start();
    }
}