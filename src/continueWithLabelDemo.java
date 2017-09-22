/**
 * Created by tfabella on 9/21/2017.
 * The following example program, ContinueWithLabelDemo, uses nested loops to search for a substring within another string.
 * Two nested loops are required: one to iterate over the substring and one to iterate over the string being searched.
 * The following program, ContinueWithLabelDemo, uses the labeled form of continue to skip an iteration in the outer loop.
 *
 * Here is the output from this program: "Found it"
 */
public class continueWithLabelDemo {
    public static void main(String[] args) {

        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() -
                substring.length();

        test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            foundIt = true;
            break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
}