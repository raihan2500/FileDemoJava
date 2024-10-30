package file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        File person = new File("Person");
        person.mkdir();

        String path = person.getAbsolutePath();
        System.out.println(path);

        File file1 = new File(path + "/hello.txt");
        File file2 = new File(path + "/world.txt");
        try{
            file1.createNewFile();
            file2.createNewFile();
        }catch (Exception e){

        }

        file1.delete();
        System.out.println(file1.exists());
    }
}
