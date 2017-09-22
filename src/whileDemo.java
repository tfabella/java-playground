/**
 * Created by tfabella on 9/21/2017.
 * The while statement evaluates expression, which must return a boolean value.
 * If the expression evaluates to true, the while statement executes the statement(s) in the while block.
 * The while statement continues testing the expression and executing its block until the expression evaluates to false.
 * Using the while statement to print the values from 1 through 10 can be accomplished as in the following WhileDemo program:
 *
 * NOTE: compare this with "doWhileDemo.java" and "forDemo.java".
 */
public class whileDemo {
    public static void main(String[] args){
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
    }
}