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
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            HashMap<String, String> definitions = new HashMap<String, String>();

            System.out.println("Enter a word");
            String word = reader.nextLine();


            for (String v: definitions.keySet())

            {
                System.out.println(v + " : " + definitions.get(v));
            }

            try {

                File myFile = new File("src/test.txt");
                Scanner myReader = new Scanner(myFile);
                while (myReader.hasNextLine()) {
                    String txt = myReader.nextLine();
                    System.out.println(txt);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }}






