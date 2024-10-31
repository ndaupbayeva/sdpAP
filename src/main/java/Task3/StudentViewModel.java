package Task3;

import java.util.ArrayList;
import java.util.List;

public class StudentViewModel {
    private List<Student> students = new ArrayList<>();
    private int idCounter = 1;

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(String name, int age, String course) {
        Student student = new Student(idCounter++, name, age, course);
        students.add(student);
    }

    public void updateStudent(int id, String name, int age, String course) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(name);
                student.setAge(age);
                student.setCourse(course);
                break;
            }
        }
    }
}

