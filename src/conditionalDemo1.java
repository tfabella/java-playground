/**
 * Created by tfabella on 9/13/2017.
 *
 * Language Basics - VARIABLES (docs.oracle.com tutorial)
 *
 * The following program, ConditionalDemo1, tests these operators.
 *
 * && Conditional-AND
 * || Conditional-OR
 *
 */
public class conditionalDemo1 {
    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");
    }
}
