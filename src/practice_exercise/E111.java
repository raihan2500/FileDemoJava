package practice_exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;

public class E111 {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        try {
            PrintWriter out = new PrintWriter(file);
            out.println("Hello, World!");
            out.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        File output = new File("hello.txt");

        try{
            Scanner in = new Scanner(output);
            while (in.hasNext())
                System.out.print(in.next());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
