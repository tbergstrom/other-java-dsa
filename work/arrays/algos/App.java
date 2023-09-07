import java.util.Arrays;
import java.util.HashMap;

public class App {

    public static void main(String[] args) {

    }

    public int searchInArray(int[] intArray, int valueToSearch) {

    //    Write a program to to check if an array contains a number in Java.
    //    int[] intArray = {1,2,3,4,5,6};
    //    searchInArray(intArray, 6); // 5

       for (int i = 0; i < intArray.length; i++) {
           if(intArray[i] == valueToSearch) {
               return i;
           }
       }
       return -1;
    }

    public String maxProduct(int[] intArray) {
    // Max Product of Two Integers
    //How to find maximum product of two integers in the array where all elements are positive.
    //Example
    //
    //    int[] intArray = {10,20,30,40,50};
    //    maxProduct(intArray) // (40,50)

        // loop through the array twice.
        // use a Max variable. Set it to 0 first, then everytime we come across a bigger number, update Max
        // loop thru again, with another subMax variable. update it each time the value is larger than subMax, but either
        // skip the Max variable in the array or just check to see if each value is also smaller than Max

        int max = 0;
        int subMax = 0;

        for (int j : intArray) {
            if (j > max) {
                max = j;
            }
        }
        for (int j : intArray) {
            if (j > subMax && j < max) {
                subMax = j;
            }
        }
        return max + "," + subMax;
    }

    public boolean isUnique(int[] intArray) {
    //IsUnique / Contains Duplicate - LeetCode 217
        //
        //Write a program to check if an array is unique or not.
        //
        //Example
        //
        //    int[] intArray = {1,2,3,4,5,6};
        //    isUnique(intArray) // true
        // TODO

        HashMap<Integer, Integer> valueMap = new HashMap<>();
        for (int i = 0; i < intArray.length; i++) {
            if(!valueMap.containsValue(intArray[i])) {
                valueMap.put(i, intArray[i]);
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean permutation(int[] array1, int[] array2){
    // Permutation
        //
        //Your are given two integer arrays. Write a program to check if they are permutation of each other.
        //
        //Example
        //
        //    int[] array1 = {1,2,3,4,5};
        //    int[] array2 = {5,1,2,3,4};
        //    permutation(array1, array2)
        //
        //Output
        //
        //true

        System.out.println(Arrays.toString(Arrays.stream(array1).sorted().toArray()));
        System.out.println(Arrays.toString(Arrays.stream(array2).sorted().toArray()));

        return Arrays.toString(Arrays.stream(array1).sorted().toArray()).equals(Arrays.toString(Arrays.stream(array2).sorted().toArray()));

    }

    public void rotateMatrix(int[][] matrix) {
        //Rotate Matrix
        //Given an image represented by an NxN matrix write a method to rotate the image by 90 degrees.
        // public boolean rotateMatrix(int[][] matrix) { if (matrix.length == 0 || matrix.length != matrix[0].length)
        // return false; int n = matrix.length; for (int layer = 0; layer < n/2; layer++)
        // { int first = layer; int last = n - 1 - layer; for (int i=first;


    }
}
