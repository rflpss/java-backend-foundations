package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		System.out.println();

		File path = new File(strPath);

		File outFolder = new File(path.getParent() + "\\out");
		outFolder.mkdir();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(outFolder , "summary.csv")))) {
				while (line != null) {
					String[] fields = line.split(",");
					double price = Double.parseDouble(fields[1]);
					double quantity = Double.parseDouble(fields[2]);
					double total = price * quantity;
					bw.write(fields[0] + "," + String.format("%.2f", total));
					bw.newLine();
					line = br.readLine();
				}
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}