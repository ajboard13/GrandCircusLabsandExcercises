package BonusWork.Bonus5;

/**
 * Created by user on 7/6/2017.
 */
public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int score;

    public Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    @Override
    public int compareTo(Student student) {
        return 0;
    }
}
