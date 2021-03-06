package BonusWork.Bonus5;

import javax.swing.*;
import java.awt.*;

/**
 * Created by user on 7/6/2017.
 */
public class myListCellRenderer extends JLabel implements ListCellRenderer<Student> {
    @Override
    public Component getListCellRendererComponent(JList list, Student student, int index, boolean isSelected, boolean cellHasFocus) {
        String fullName = student.getLastName() + ", " + student.getFirstName();
        int testScore = student.getScore();
        String cellHtml = "<html><ul style =\"list-style-type: none;\">\n" +
                            "<li><h3>" +fullName+"</h3>\n" +"<p><strong>Test Score: </strong>" +testScore+ "</li>\n" +"</ul></html>";
        setText(cellHtml);
        ImageIcon profilePic = new ImageIcon("C:\\Users\\user\\IdeaProjects\\GrandCircusWork\\img\\emptyProfile.jpg");
        profilePic = new ImageIcon(profilePic.getImage().getScaledInstance(75,75,Image.SCALE_SMOOTH));
        setIcon(profilePic);

        return this;
    }
}
