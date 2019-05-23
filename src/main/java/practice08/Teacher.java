package practice08;

public class Teacher extends Person{

    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        String className = klass != null ? " Class " + klass.getNumber() : " No Class";
        return super.introduce() + " I am a Teacher. I teach" + className + ".";
    }

    public String introduceWith(Student student) {
        String dont = klass.getNumber() == student.getKlass().getNumber() ? "" : "don't ";
        return super.introduce() + " I am a Teacher. I " + dont + "teach " + student.getName() + ".";
    }
}
