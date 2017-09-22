/**
 * Created by tfabella on 9/13/2017.
 *
 * Language Basics - VARIABLES (docs.oracle.com tutorial)
 *
 * In the Java programming language, a multidimensional array is an array whose components are themselves arrays.
 * This is unlike arrays in C or Fortran.
 * A consequence of this is that the rows are allowed to vary in length, as shown in the following MultiDimArrayDemo program:
 */
public class multiDimArrayDemo {
    public static void main(String[] args){
            String[][] names = {
                    {"Mr. ", "Mrs. ", "Ms. "},
                    {"Smith", "Jones"}
            };
            // Mr. Smith
            System.out.println(names[0][0] + names[1][0]);
            // Ms. Jones
            System.out.println(names[0][2] + names[1][1]);
    }
}