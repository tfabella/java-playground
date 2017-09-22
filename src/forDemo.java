/**
 * Created by tfabella on 9/21/2017.
 * The for statement provides a compact way to iterate over a range of values.
 * Programmers often refer to it as the "for loop" because of the way in which it repeatedly loops until a particular condition is satisfied.
 * The following program, ForDemo, uses the general form of the for statement to print the numbers 1 through 10 to standard output:
 *
 * NOTE: compare this with "whileDemo.java" and "doWhileDemo.java".
 */
public class forDemo {
    public static void main(String[] args){
        for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
        }
    }
}