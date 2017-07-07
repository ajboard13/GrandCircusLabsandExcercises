package BonusWork.Bonus5;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/*
Aaron Board

7/6/2017
 */
public class Bonus5Gui {
    private JPanel base;
    private JLabel lastNameLabel;
    private JLabel firstNameLabel;
    private JLabel testScoreLabel;
    private JTextField lastNameEditText;
    private JTextField firstNameEditText;
    private JSlider testScoreSlider;
    private JButton addStudentButton;
    private JList studentListDisplay;
    private JButton clearStudentsButton;
    private JScrollPane listViewScrollPane;
    private JLabel titleLabel;
    private JButton sortByScoreButton;
    private JButton sortByNameButton;
    private static ArrayList<Student> studentList = new ArrayList<>();

    private static JFrame frame = new JFrame("Bonus5Gui");

    public static void main(String[] args) {
        frame.setContentPane(new Bonus5Gui().base);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        lastNameEditText = new JTextField(15);
        firstNameEditText = new JTextField(15);
        testScoreSlider = new JSlider();
        addStudentButton = new JButton();
        clearStudentsButton = new JButton();
        sortByNameButton = new JButton();
        sortByScoreButton = new JButton();
        studentListDisplay = new JList();


        DefaultListModel<Student> model = new DefaultListModel();
        ListCellRenderer myListRenderer = new myListCellRenderer();
        studentListDisplay.setCellRenderer(myListRenderer);
        studentListDisplay.setModel(model);

        addStudentButton.addActionListener(e -> {
            addStudent(model);
            studentListDisplay.updateUI();
        });

        clearStudentsButton.addActionListener(e -> {
            clearStudents(model);
            studentListDisplay.updateUI();
        });

        sortByScoreButton.addActionListener(e -> {
            sortByScore(model);
            studentListDisplay.updateUI();
        });

        sortByNameButton.addActionListener(e -> {
            sortByName(model);
            studentListDisplay.updateUI();
        });

    }

    private void sortByName(DefaultListModel model) {
        model.removeAllElements();
        studentList.removeIf(Objects::isNull);
        for (Student student: studentList) {
            student.setSortByScore(false);
        }
        Collections.sort(studentList);
        for (Student student: studentList){
            model.addElement(student);
        }
        studentListDisplay.updateUI();
    }

    private void sortByScore(DefaultListModel model) {
        model.removeAllElements();
        studentList.removeIf(Objects::isNull);
        for (Student student: studentList) {
            student.setSortByScore(true);
        }
        Collections.sort(studentList);
        for (Student student: studentList){
            model.addElement(student);
        }
        studentListDisplay.updateUI();
    }

    private void addStudent(DefaultListModel model){
        if(firstNameEditText.getText().isEmpty() || lastNameEditText.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame, "Please enter a valid name!");
        }else {
            model.addElement(new Student(firstNameEditText.getText(), lastNameEditText.getText(), testScoreSlider.getValue()));
            studentList.add(new Student(firstNameEditText.getText(), lastNameEditText.getText(), testScoreSlider.getValue()));
        }
    }

    private void clearStudents(DefaultListModel model){
        model.removeAllElements();
        studentList = new ArrayList<>();
    }

}
