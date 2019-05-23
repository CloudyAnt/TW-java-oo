package practice11;

import java.util.LinkedList;

public class Klass {

    private int number;
    private Student leader;

    private LinkedList<Teacher> teachers = new LinkedList<>();

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
        if (student.getKlass().getNumber() == this.getNumber()) {
            this.leader = student;
            for (Teacher teacher: teachers) {
                teacher.newAppointedLeaderOf(this, student);
            }
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        for (Teacher teacher: teachers) {
            teacher.newJointedMemeberOf(this, student);
        }
        student.setKlass(this);
    }

    public Student getLeader() {
        return leader;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
}
