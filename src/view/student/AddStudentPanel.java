package view.student;

import model.Student;
import view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudentPanel extends JPanel {
    public AddStudentPanel(){
        JTextField name = new JTextField(10);
        JTextField surname = new JTextField(10);
        JButton addStudent = new JButton("Добавить");
        add(name);
        add(surname);
        add(addStudent);

        addStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Student(name.getText(), surname.getText());
                name.setText("");
                surname.setText("");
                MainFrame.addStudentFrame.setVisible(false);
                System.out.println(Student.list);
            }
        });
        setVisible(true);
    }
}
