/**
 * Created by tfabella on 9/13/2017.
 *
 * Language Basics - VARIABLES (docs.oracle.com tutorial)
 *
 * For your convenience, Java SE provides several methods for performing array manipulations (common tasks, such as copying, sorting
 * and searching arrays) in the java.util.Arrays class.
 * or instance, the previous example can be modified to use the copyOfRange method of the java.util.Arrays class, as you can see in
 * the ArrayCopyOfDemo example. The difference is that using the copyOfRange method does not require you to create the destination array
 * before calling the method, because the destination array is returned by the method:
 */
public class arrayCopyOfDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

        System.out.println(new String(copyTo));
    }
}