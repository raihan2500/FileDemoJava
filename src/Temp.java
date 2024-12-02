import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        File file = new File("temp.txt");
        try{
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(PrintStream inp = new PrintStream(file)){
            for(int i = 0; i < 1000; i++){
                long fact = 1;
                inp.print("1");
                for(int j = 2; j <= i; j++){
                    inp.print(" x " + j);
                    fact *= j;
                    fact %= (1e9 + 7);
                }
                inp.println(" = " + fact);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try (Scanner in = new Scanner(file)) {
            while(in.hasNext()){
                System.out.println(in.next());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
