import java.io.*;
import java.util.Formatter;

public class FaltuLanguage {
    public static void main(String[] args){
        char c = '1';

        try {
            PrintStream out = new PrintStream(new FileOutputStream("hello.txt", true));
            out.println("This is PrintStream");
            out.close();

            PrintWriter out1 = new PrintWriter(new FileWriter("hello.txt", true));
            out1.println("This is PrintWriter");
            out1.close();

            Formatter out2 = new Formatter(new FileWriter("hello.txt", true));
            out2.format("%s\n", "This is Formatter");
            out2.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Done.");
    }
}
