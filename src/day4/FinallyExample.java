package day4;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class FinallyExample {

    public static void main(String[] args) {
        Scanner filescanner = null;
        try {
            File file = new File("src/Day4/data.txt");
            System.out.println(file.getAbsolutePath());
            filescanner = new Scanner(file);
            System.out.println("\nFile Content:");
            while (filescanner.hasNext()) {
                System.out.println(filescanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception +" + e);
        } finally {
            if (filescanner != null) {
                filescanner.close();
            }
            System.out.println("Closed");
        }
    }}

