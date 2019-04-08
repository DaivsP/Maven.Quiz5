package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    private List<Student> studentList;

    public ZipCodeWilmington(List<Student> studentList) {
        this.studentList = studentList;
    }

    public ZipCodeWilmington() {
        studentList = new ArrayList<>();
    }

    public void enroll(Student student) {
        this.studentList.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return this.studentList.contains(student);
    }

    public void lecture(double numberOfHours) {
        for (Student student : studentList){
            student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studentMap = new LinkedHashMap<>();
        for (Student student : studentList){
            studentMap.put(student, student.getTotalStudyTime());
        }
        return studentMap;
    }
}
