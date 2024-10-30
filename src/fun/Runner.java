package fun;

import java.io.*;
import java.util.*;

public class Runner {

    static class Cmp implements Comparator<Person>{
        @Override
        public int compare(Person a, Person b){
            if(a.getAge() < b.getAge())return -1;
            else if(a.getAge() == b.getAge())return 0;
            return 1;
        }
    }

    public static void main(String[] args) {

        ArrayList<Person> persons =  new ArrayList<>();
        File file = new File("/home/raihan/Desktop/Restart Java/Books/FileDemo/people.txt");

        try{
            Scanner in = new Scanner(file);
            while(in.hasNext()){
                String name = in.next();
                String district = in.next();
                int age = in.nextInt();

                persons.add(new Person(name, district, age));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        HashMap<String, ArrayList<Person>> mp = new HashMap<>();

        for(var person : persons){
            String district = person.getDistrict();

            if(mp.containsKey(district)){
                mp.get(district).add(person);
            }else{
                mp.put(district, new ArrayList<>());
                mp.get(district).add(person);
            }
        }

        for (Map.Entry<String, ArrayList<Person>> entry : mp.entrySet()) {
            Collections.sort(entry.getValue(), new Cmp());
        }

        File output = new File("/home/raihan/Desktop/Restart Java/Books/FileDemo/output.txt");

        try(Formatter  formatter = new Formatter(output)) {
            for(var element : mp.entrySet()){
                formatter.format("District name: %s\n", element.getKey());
                for(var person : element.getValue()){
                    formatter.format("Name: %s\n", person.getName());
                    formatter.format("Age: %d\n\n", person.getAge());
                }
                formatter.format("\n\n");
            }
            formatter.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}