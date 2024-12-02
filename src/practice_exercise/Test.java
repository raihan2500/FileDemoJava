package practice_exercise;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        File input = new File("input.txt");
        File output = new File("output.txt");

        try{
            PrintWriter out = new PrintWriter(output);
            Scanner in = new Scanner(input);
            double total = 0;
            while(in.hasNextDouble()){
                double num = in.nextDouble();
                total += num;
                out.println("        " + num);
            }
            out.println("Total: " + total);
            int x = 3 / 0;
            in.close();
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
        }


//        try{
//            PrintStream out = new PrintStream(output);
//            out.println("Java 1ta faltu language");
//            out.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}
