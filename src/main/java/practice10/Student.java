package practice10;

public class Student extends Person {

    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass getNumber() {
        return klass;
    }

    public String introduce() {
        String roleWords = klass.getLeader() == this ? " I am Leader of" : " I am at";
        return super.introduce() + " I am a Student." + roleWords + " Class " + klass.getNumber() + ".";
    }
}
