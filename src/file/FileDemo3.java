package file;

import java.io.File;
import java.util.Scanner;

public class FileDemo3 {
    public static void main(String[] args) {

        try{
            File file = new File("/media/raihan/Documents/Java/Restart Java/Books/FileDemo/Person/edit.txt");
            Scanner in = new Scanner(file);
            while (in.hasNext()){
                String name = in.next();
                String id = in.next();

                System.out.println(name + " " + id);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
