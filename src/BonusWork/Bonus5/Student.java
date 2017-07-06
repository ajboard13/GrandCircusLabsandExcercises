package BonusWork.Bonus5;


import java.util.Comparator;


/*
Aaron Board

7/6/2017
 */
public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int score;
    private boolean sortByScore =false;

    Student(String firstName, String lastName, int score) {
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
        this.score = score;
    }

    void setSortByScore(boolean sortByScore) {
        this.sortByScore = sortByScore;
    }

    @Override
    public String toString() {
        return lastName+ ", "+ firstName+": "+score;
    }

    private String getFirstName() {
        return firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student student) {
        if (sortByScore){
            return Comparator.comparing(Student::getScore)
                    .thenComparing(Student::getLastName)
                    .thenComparing(Student::getFirstName).reversed()
                    .compare(this, student);
        }else {
            return Comparator.comparing(Student::getLastName)
                    .thenComparing(Student::getFirstName)
                    .thenComparingInt(Student::getScore)
                    .compare(this, student);
        }
    }
}
