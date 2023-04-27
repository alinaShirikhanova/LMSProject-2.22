package view.student;

import model.Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentListPanel extends JPanel {
    static String[] headers = {"ID", "Name", "Surname"};
    public static DefaultTableModel model = new DefaultTableModel(headers, 0);
    public StudentListPanel() {
        JTable table = new JTable();
        table.setModel(model);
        JScrollPane scroll = new JScrollPane(table);
        add(scroll);
    }



    public static void addRow(Student student) {
        model.addRow(
                new Object[]{
                        student.getId(),
                        student.getName(),
                        student.getSurname()
                }
        );
    }
}
