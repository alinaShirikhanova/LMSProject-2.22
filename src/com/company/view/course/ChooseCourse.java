package com.company.view.course;

import com.company.model.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseCourse extends JFrame {
    CourseListPanel panel;

    public ChooseCourse(Student student) {
        setTitle("Выбор курса");
        setSize(400, 520);
        setLocation(650, 150);
        setLayout(new FlowLayout());
        panel = new CourseListPanel();
        add(panel);

        JButton button = new JButton("Зачислить");
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
}
