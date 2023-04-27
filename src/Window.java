import model.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    public Window() {
        setTitle("Окно");
        setSize(500, 500);
        setLocation(720, 200);
        setLayout(new FlowLayout());


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
                System.out.println(Student.list);
            }
        });
        setVisible(true);
    }
}
//Добавить два тиекстовых поля для названия курса и описания курса. Также добавить кнопку для добавления курса.
//После создания курса в консоль должен выводиться список курсов.