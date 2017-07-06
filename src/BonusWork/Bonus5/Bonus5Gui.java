package BonusWork.Bonus5;

import javax.swing.*;

/**
 * Created by user on 7/6/2017.
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

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bonus5Gui");
        frame.setContentPane(new Bonus5Gui().base);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
