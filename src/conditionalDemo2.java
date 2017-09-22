/**
 * Created by tfabella on 9/13/2017.
 *
 * Language Basics - VARIABLES (docs.oracle.com tutorial)
 *
 * Another conditional operator is ?:, which can be thought of as shorthand for an if-then-else statement(discussed in the Control Flow Statements section of this lesson).
 * This operator is also known as the ternary operator because it uses three operands.
 *
 * In the following example, this operator should be read as:
 * "If someCondition is true, assign the value of value1 to result. Otherwise, assign the value of value2 to result."
 *
 * The following program, ConditionalDemo2, tests the ?: operator
 */
public class conditionalDemo2 {
    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);
    }
}
