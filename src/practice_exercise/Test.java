package practice_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        File input = new File("input.txt");
        File output = new File("output.txt");

        try {
            Scanner in = new Scanner(input);
            PrintWriter out = new PrintWriter(output);
            double total = 0;
            while(in.hasNextDouble()){
                double num = in.nextDouble();
                total += num;
                out.println("        " + num);
            }
            out.println("Total: " + total);
            in.close();
            out.close();
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
