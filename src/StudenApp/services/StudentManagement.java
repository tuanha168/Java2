package StudenApp.services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import StudenApp.entities.Student;

public class StudentManagement {
    private List<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudent(int id) {
        for (var student : students) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void saveToFile() {
        if (students != null) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
                oos.writeObject(students);
                System.out.println("Ghi file thanh cong");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void readFile() throws Exception {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"))) {
            students = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw e;
        }
    }
}