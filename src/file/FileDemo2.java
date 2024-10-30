package file;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class FileDemo2 {
    public static void main(String[] args) {
        File file1 =  new File("/media/raihan/Documents/Java/Restart Java/Books/FileDemo/Person/edit.txt");

        try{
            file1.createNewFile();
        }catch (Exception e){

        }
        String path = file1.getAbsolutePath();
        System.out.println(path);

        try{
            Formatter formatter = new Formatter(path);

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            for(int i = 0; i < n; i++){
                String id = in.next();
                String name = in.next();
                formatter.format("%s %s \r\n", id, name);
            }
            formatter.close();

        }catch (Exception e){

        }


    }
}
