package practice07;

public class Teacher extends Person{

    private Klass klass;

    public Teacher(String string, int age) {
        super(string, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        String teachingClass = klass.getNumber() == 0 ? "No Class" : "Class " + klass;
        return super.introduce() + " I am a Teacher. I teach " + teachingClass + ".";
    }

    public String introduceWith(Student student) {
        String teachingStudent = klass.getNumber() == student.getKlass().getNumber() ? "" : "don't ";
        return super.introduce() + " I am a Teacher. I " + teachingStudent + "teach " + student.getName();
    }
}
