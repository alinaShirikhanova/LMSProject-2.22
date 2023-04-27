package view;

import view.course.AddCourseFrame;
import view.student.AddStudentFrame;
import view.student.StudentListPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static AddStudentFrame addStudentFrame = new AddStudentFrame();
    public static AddCourseFrame addCourseFrame = new AddCourseFrame();
    public MainFrame() {
        setTitle("Окно");
        setSize(500, 500);
        setLocation(720, 200);
        setLayout(new FlowLayout());
        setJMenuBar(new MainMenuBar());
        add(new StudentListPanel());

        setVisible(true);
    }
}
