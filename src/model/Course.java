package model;

import java.util.ArrayList;

public class Course {
    private int id;
    private String title;
    private String description;
    static int lastID = 0;
    public static ArrayList<Course> list = new ArrayList<>();


    public Course(String title, String description) {
        this.id = lastID++;
        this.title = title;
        this.description = description;
        list.add(this);
    }

    public CourseEnrollment addStudent(Student student){
        return new CourseEnrollment(student, this);
    }


    public ArrayList<Student> getStudents(){
        return CourseEnrollment.getStudentsByCourse(this);
    }
    @Override
    public String toString() {
        return id + ". " + title + " " + description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
