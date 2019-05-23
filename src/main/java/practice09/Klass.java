package practice09;

public class Klass {

    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        appendMember(student);
        this.leader = student;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }

    public Student getLeader() {
        return leader;
    }
}
