package practice09;

public class Person {

    private int id, age;
    private String name;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person)obj;
            if (person.getId() == this.getId()) {
                return true;
            }
        }
        return super.equals(obj);
    }
}
