package group;

import student.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Group{
    private List<Student> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }
}
