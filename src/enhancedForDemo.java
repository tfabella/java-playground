/**
 * Created by tfabella on 9/21/2017.
 * The enhanced for statement can be used to make your loops more compact and easy to read.
 * In this example, the variable item holds the current value from the numbers array.
 * We recommend using this form of the for statement instead of the general form whenever possible.
 */
public class enhancedForDemo {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
    }
}