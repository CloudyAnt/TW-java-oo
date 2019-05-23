package practice08;

public class Person {

    private int id, age;
    private String name;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }
}
