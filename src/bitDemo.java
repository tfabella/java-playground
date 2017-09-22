/**
 * Created by tfabella on 9/13/2017.
 *
 * Language Basics - VARIABLES (docs.oracle.com tutorial)
 *
 *
 * The bitwise & operator performs a bitwise AND operation.
 *
 *  The bitwise ^ operator performs a bitwise exclusive OR operation.
 *
 *  The bitwise | operator performs a bitwise inclusive OR operation.
 *
 * The following program, BitDemo, uses the bitwise AND operator to print the number "2" to standard output.
 */
public class bitDemo {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);
    }
}
