package Intermediario.Record;

public class Ninja {
    // classe sem records

    private final String name;
    private final String village;
    private final int age;

    public Ninja(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getVillage() {
        return village;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Ninja: \n" +
                "name: " + name + '\n' +
                "village: " + village + '\n' +
                "age: " + age;
    }
}
