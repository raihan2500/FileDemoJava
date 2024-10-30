package fun;

public class Person {
    private String name;
    private String district;
    private int age;

    public Person(String name, String district, int age) {
        this.name = name;
        this.district = district;
        this.age = age;
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "District: " + district + "\n" +
                "Age: " + age + "\n";

    }
}