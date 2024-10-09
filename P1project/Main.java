package P1project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFile = "data/shakespeare.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line = reader.readLine();
            while (line != null) {

                String[] words = line.split("\\s+");
                for (String w : words) {
                    System.out.println(w);
                }
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("We can't find file " + inputFile);
        } catch (IOException e) {
            System.out.println("Error during reading file" + inputFile);
        }
    }
}
