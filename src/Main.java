import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//Exercise 2:
//Create a prepopulated text file of at least 3 dictionary entries (word, definition).
//
//Write a program that loads the entries into a Hash map, and prompts the user for a word to lookup.
//
//If the word is found, display its definition.
public class Main {
    private static HashMap<String, String> definitions = new HashMap<String, String>();

    public static void main(String[] args) {
        File myFile = new File("src/test.txt");
        Scanner reader = new Scanner(System.in);

        try {
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String txt = myReader.nextLine();
                String[] parts = txt.split(",");
                definitions.put(parts[0], parts[1]);
                System.out.println("Enter a word");
                String defWord = reader.nextLine().trim().toLowerCase();
                String response = definitions.get(defWord) != null?definitions.get(defWord):"Word not found!";

                System.out.println(response);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }



        for (String s : definitions.keySet())

            {
                System.out.println(s + " : " + definitions.get(s));
            }


    }
}






