package view.course;

import model.Course;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CourseListPanel extends JPanel {

    public CourseListPanel() {
        JTable table = new JTable();

        table.setModel(Course.model);
        JScrollPane scroll = new JScrollPane();
        this.add(scroll);
        setVisible(true);
    }
}