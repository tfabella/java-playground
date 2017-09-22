/**
 * Created by tfabella on 9/21/2017.
 * The continue statement skips the current iteration of a for, while , or do-while loop.
 * The unlabeled form skips to the end of the innermost loop's body and evaluates the boolean expression that controls the loop.
 * The following program, ContinueDemo , steps through a String, counting the occurences of the letter "p".
 * If the current character is not a p, the continue statement skips the rest of the loop and proceeds to the next character.
 * If it is a "p", the program increments the letter count.
 *
 * Here is the output of this program: "Found 9 p's in the string."
 */
public class continueDemo {
    public static void main(String[] args) {

        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}