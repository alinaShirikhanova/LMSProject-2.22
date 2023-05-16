package com.company.view.course;

import com.company.model.Course;
import com.company.model.CourseEnrollment;
import com.company.model.Student;
import com.company.view.repository.StudentRepository;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseJPopUpMenu extends JPopupMenu {
    public static JTable table;
    public CourseJPopUpMenu(JTable table) {
        CourseJPopUpMenu.table = table;
        JMenuItem edit = new JMenuItem("Сохранить");
        JMenuItem enroll = new JMenuItem("Зачислить студента");
        JMenuItem delete = new JMenuItem("Удалить");

        edit.setActionCommand("save");
        enroll.setActionCommand("enroll");
        delete.setActionCommand("delete");

        MenuItemListener menuItemListener = new MenuItemListener();

        edit.addActionListener(menuItemListener);
        enroll.addActionListener(menuItemListener);
        delete.addActionListener(menuItemListener);


        add(edit);
        add(enroll);
        add(delete);
    }

    static class MenuItemListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int index = table.getSelectedRow();
            int id = (int) table.getValueAt(index, 0);
            String title = (String) table.getValueAt(index, 1);
            String description = (String) table.getValueAt(index, 2);

            switch (e.getActionCommand()) {
                case "save" -> StudentRepository.updateStudent(id, title, description);
                case "delete" -> {StudentRepository.deleteStudent(id);
                    Course.list.remove(1);
                }
            }
        }
    }
}
