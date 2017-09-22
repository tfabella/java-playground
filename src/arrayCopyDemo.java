/**
 * Created by tfabella on 9/13/2017.
 *
 * Language Basics - VARIABLES (docs.oracle.com tutorial)
 *
 * The following program, ArrayCopyDemo, declares an array of char elements, spelling the word "decaffeinated."
 * It uses the System.arraycopy method to copy a subsequence of array components into a second array:
 */
public class arrayCopyDemo {
        public static void main(String[] args) {
            char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
            char[] copyTo = new char[7];

            System.arraycopy(copyFrom, 2, copyTo, 0, 7);  //uses the arraycopy method of the System class
            System.out.println(new String(copyTo));
        }
}