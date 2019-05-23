package practice10;

import java.util.LinkedList;

public class Teacher extends Person {

    private LinkedList<Klass> klasses;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
    }

    public LinkedList<Klass> getClasses() {
        return klasses;
    }

    public String introduce() {
        StringBuilder className;
        if (klasses == null || klasses.size() == 0) {
            className = new StringBuilder(" No Class");
        } else {
            className = new StringBuilder(" Class ");
            boolean first = true;
            for (Klass klass: klasses) {
                if (first) {
                    className.append(klass.getNumber());
                    first = false;
                } else {
                    className.append(", ").append(klass.getNumber());
                }
            }
        }
        return super.introduce() + " I am a Teacher. I teach" + className + ".";
    }

    public boolean isTeaching(Student student) {
        for (Klass klass: klasses) {
            if (klass.getNumber() == student.getKlass().getNumber()) {
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student student) {
        String dont = isTeaching(student) ? "" : "don't ";
        return super.introduce() + " I am a Teacher. I " + dont + "teach " + student.getName() + ".";
    }
}
