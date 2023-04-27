package model;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Student {



    private int id;
    private String name;
    private String surname;
    static int lastID = 0;
    public static ArrayList<Student> list = new ArrayList<>();

    public Student(String name, String surname) {
        this.id = lastID++;
        this.name = name;
        this.surname = surname;
        list.add(this);
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    public CourseEnrollment addCourse(Course course){
        return new CourseEnrollment(this, course);
    }

    public ArrayList<Course> getCourses(){
        return CourseEnrollment.getCoursesByStudent(this);
    }

    public ArrayList<Integer> getMarks(Course course){
        return AcademicPerformance.getMarksByStudentAndCourse(this, course);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }



}
