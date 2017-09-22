/**
 * Created by tfabella on 9/13/2017.
 *
 * Language Basics - VARIABLES (docs.oracle.com tutorial)
 *
 * The following program, ArrayDemo, creates an array of integers, puts some values in the array, and prints each value to standard output.
 */

public class arrayDemo {
    public static void main(String[] args){
        int[] anArray; //declaring an array of integers
//        int[] anArray ={100, 200, 300}; //declaring an array of integers
        anArray=new int[10]; //allocating memory for 10 integers
        anArray[0]=100; //initializing first element
        anArray[1]=200; //initializing second element
        anArray[2]=300; //initializing third element
        anArray[3]=400; //and so forth
        anArray[4]=500;
        anArray[5]=600;
        anArray[6]=700;
        anArray[7]=800;
        anArray[8]=900;
        anArray[9]=1000;

        System.out.println("Element at index 0: " + anArray[0]);
        System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 5: " + anArray[5]);
        System.out.println("Element at index 6: " + anArray[6]);
        System.out.println("Element at index 7: " + anArray[7]);
        System.out.println("Element at index 8: " + anArray[8]);
        System.out.println("Element at index 9: " + anArray[9]);
        System.out.println(anArray.length); //use built-in length property to determine the size of any array
    }
}