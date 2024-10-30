package fun;

import java.io.File;
import java.util.Formatter;
import java.util.Random;

public class PersonListCreator {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Ivy", "Jack",
                "Kathy", "Leo", "Mona", "Nina", "Oscar", "Pete", "Quincy", "Rose", "Sam", "Tina"};

        String[] districts = {"Dhaka", "Rajshahi", "Narshingdi", "Nilphamari", "Narayanganj", "Magura", "Bogura", "Barishal", "Noakhali", "Kustia"};
        Random random = new Random();

        File file = new File("/home/raihan/Desktop/Restart Java/Books/FileDemo/people.txt");
        try (Formatter formatter = new Formatter(file)) {

            for(int i = 0; i < 10000; i++){

                String name = names[random.nextInt(0, names.length)];
                String district = districts[random.nextInt(0, districts.length)];
                int age = random.nextInt(18, 70);
                formatter.format("%s %s %d\r\n", name, district, age);
            }
            formatter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}