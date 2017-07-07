package BonusWork.Bonus5;

import javax.swing.*;

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

        lastNameEditText.setEnabled(true);
        firstNameEditText.setEnabled(true);
        studentListDisplay = new JList();


        DefaultListModel model = new DefaultListModel();
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

    }

    private void addStudent(DefaultListModel model){
        if(firstNameEditText.getText().isEmpty() || lastNameEditText.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame, "Please enter a valid name!");
        }else {
            model.addElement(new Student(firstNameEditText.getText(), lastNameEditText.getText(), testScoreSlider.getValue()));
        }
    }

    private void clearStudents(DefaultListModel model){
        model.removeAllElements();
    }

}
