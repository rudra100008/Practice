package com.To_Do_List;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class To_Do_List extends JFrame {
    JLabel listLabel, userLabel;
    private final JTextField userField;
    private JList<String> list;
    private DefaultListModel<String> listModel;
    private JButton add, edit, delete;

    DataBase dataBase;

    To_Do_List() {
        dataBase = new DataBase();
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
        GridBagConstraints grid = new GridBagConstraints();
        grid.fill = GridBagConstraints.HORIZONTAL;
        grid.gridx = 0;
        grid.gridy = 0;
        grid.insets = new Insets(5, 5, 5, 5); // Adding vertical space here

        userLabel = new JLabel("Enter:  ");
        userLabel.setPreferredSize(new Dimension(60, 20));
        panel.add(userLabel, grid);

        userField = new JTextField();
        userField.setPreferredSize(new Dimension(100, 20));
        grid.gridx = 1;
        panel.add(userField, grid);

        listLabel = new JLabel("List");
        listLabel.setPreferredSize(new Dimension(60, 20));
        grid.gridx = 0;
        grid.gridy = 3;
        panel.add(listLabel, grid);

        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        list.setPreferredSize(new Dimension(100, 100)); // Increased the height to show multiple items
        grid.gridx = 1;
        grid.gridy = 3;
        panel.add(new JScrollPane(list), grid); // Adding JScrollPane to handle long lists

        add = new JButton("Add");
        add.setMaximumSize(new Dimension(80, 20));
        grid.gridx = 1;
        grid.gridy = 2;
        panel.add(add, grid);

        delete = new JButton("Delete");
        delete.setMaximumSize(new Dimension(80, 20));
        grid.gridx = 2;
        panel.add(delete, grid);

        edit = new JButton("Edit");
        edit.setMaximumSize(new Dimension(80, 20));
        grid.gridx = 3;
        panel.add(edit, grid);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = userField.getText();
                dataBase.listDataBase(text);
                listModel.addElement(text); // Add the text to the listModel
                userField.setText("");
            }
        });

        add(panel);
    }

    public static void main(String[] args) {
        To_Do_List toDoList = new To_Do_List();
        toDoList.setLayout(new FlowLayout(FlowLayout.CENTER));
        toDoList.setTitle("To_Do_List");
        toDoList.setSize(500, 500);
        toDoList.setVisible(true);
    }
}

