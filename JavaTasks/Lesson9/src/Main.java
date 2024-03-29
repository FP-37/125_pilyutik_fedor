import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) {
        char[] vowels = {'а','е','ё','и','о','у','ы','э','ю','я'};
        int vowelCounter = 0;
        int consonantCounter = 0;
        try {
            File file = new File("src\\Verse.txt");
            FileReader fReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fReader);
            String line;
            while ((line = reader.readLine()) != null) {
                int vowelLineCounter = 0;
                int symbolCounter = 0;
                for (int x = 0; x < line.length();x++) {
                    for (int y = 0; y< vowels.length; y++) {
                        if (vowels[y] == line.toLowerCase().charAt(x)) {
                            vowelLineCounter++;
                            continue;
                        }
                    }
                    if (line.toLowerCase().charAt(x) == '.' || line.toLowerCase().charAt(x) == ',' || line.toLowerCase().charAt(x) == ' ') {
                        symbolCounter++;
                    }
                }
                int consonantLineCounter = line.length()-vowelLineCounter-symbolCounter;
                vowelCounter += vowelLineCounter;
                consonantCounter += consonantLineCounter;
                System.out.println("Количество гласных в строке: " + vowelLineCounter + ", количество согласных в строке: " + consonantLineCounter);
            }
            String results = "Количество гласных в стихотворении: " + vowelCounter + ", количество согласных в стихотворении: " + consonantCounter;
            System.out.println(results);
            BufferedWriter fw = new BufferedWriter(new FileWriter("src\\Verse.txt",true));
            fw.newLine();
            fw.newLine();
            fw.write(results);
            fw.close();
        reader.close();
        fReader.close();
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}