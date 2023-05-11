package view.student;

import model.Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentListPanel extends JPanel {
    public static JTable table;

    public StudentListPanel() {
        table = new JTable();
        table.setModel(Student.model);
        JScrollPane scroll = new JScrollPane(table);
        add(scroll);
        StudentJPopUpMenu studentJPopUpMenu = new StudentJPopUpMenu(table);

        table.setComponentPopupMenu(studentJPopUpMenu);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == 3) {
                    studentJPopUpMenu.show(table, e.getX(), e.getY());
                }
            }
        });
    }
}
