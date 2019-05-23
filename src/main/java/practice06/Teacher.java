package practice06;

public class Teacher extends Person{

    private int klass;

    public Teacher(String string, int age) {
        super(string, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        String teachingClass = klass == 0 ? "No Class" : "Class " + klass;
        return super.introduce() + " I am a Teacher. I teach " + teachingClass + ".";
    }
}
