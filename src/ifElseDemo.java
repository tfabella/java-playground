/**
 * Created by tfabella on 9/21/2017.
 * The if-then-else statement provides a secondary path of execution when an "if" clause evaluates to false.
 * The following program, IfElseDemo, assigns a grade based on the value of a test score:
 * an A for a score of 90% or above, a B for a score of 80% or above, and so on.
 */
public class ifElseDemo {
    public static void main(String[] args) {

        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }
}