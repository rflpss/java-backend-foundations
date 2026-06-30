package application;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);

        Map<String, Integer> votes = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);
                line = br.readLine();

                if (votes.containsKey(name)) {
                    int quantityvotes = votes.get(name);
                    votes.put(name, count + quantityvotes);
                }
                else {
                    votes.put(name, count);
                }
            }

            for (String Key : votes.keySet()) {
                System.out.println(Key + ": " + votes.get(Key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}