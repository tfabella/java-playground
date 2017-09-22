/**
 * Created by tfabella on 9/21/2017.
 * The break statement has two forms: labeled and unlabeled.
 * This demo uses an unlabeled break to terminate a for, while, or do-while loop, as shown in the following BreakDemo program.
 * This program searches for the number 12 in an array.
 * The break statement, shown in boldface, terminates the for loop when that value is found.
 * Control flow then transfers to the statement after the for loop.
 */
public class breakDemo {
    public static void main(String[] args) {

        int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }
    }
}