package home_work_20;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

//src/main/java/home_work_20/text.txt
public class Main {
    public static long countOccurrences(String source, String find) {

        return Pattern.compile(find) // Pattern
                .matcher(source) // Mather
                .results()       // Stream<MatchResults>
                .count();
    }

    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("You enter  = " + inputString);


        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/home_work_20/text.txt"));
            String line = reader.readLine();
            while (line != null) {
                if (countOccurrences(line, inputString) == 1) {
                    count++;
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Count in file = " + count);
    }
}