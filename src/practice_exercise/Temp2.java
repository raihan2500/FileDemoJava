package practice_exercise;

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;
public class Temp2 {

    public static void main(String[] args) {
        String file_name1 = "input.txt";
        File file1 = new File(file_name1);
        File file2 = new File("output.txt");

        try( Scanner inp = new Scanner(file1); PrintStream out = new  PrintStream(file2)) {
            double sum = 0;
            while(inp.hasNextDouble()){
                sum += inp.nextDouble();
            }
            out.println("Sum: " + sum);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
