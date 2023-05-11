package view.student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentJPopUpMenu extends JPopupMenu {
    public StudentJPopUpMenu() {
        JMenuItem edit = new JMenuItem("Редактировать");
        JMenuItem enroll = new JMenuItem("Зачислить на курс");
        JMenuItem delete = new JMenuItem("Удалить");

        edit.setActionCommand("edit");
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
            if (e.getActionCommand().equals("edit")) {

            }


        }
    }
}
