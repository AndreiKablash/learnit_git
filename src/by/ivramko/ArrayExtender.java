package by.ivramko;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExtender {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter length of initial array: ");
        int baseArrayLength = sc.nextInt();
        int[] arr = generateRandomArray(baseArrayLength);
        int[] extendedArray = extendArray(arr);
        System.out.println("*** Initial array ***");
        System.out.println(Arrays.toString(arr));
        System.out.println("*** Extended array ***");
        System.out.println(Arrays.toString(extendedArray));
    }

    /**
     * The method extends array.
     * If array {1, 2, 3} has been passed to this method then array {1, 2, 3, 2, 4, 6}
     * is returned from this method.
     *
     * @param arr - base of extension. Extended array contains elements from this array
     * and additionally contains the same elements multiplied by two.
     * @return extended array.
     */
    public static int[] extendArray(int[] arr) {
        int lengthOfOldArray = arr.length;
        int lengthOfNewArray = lengthOfOldArray*2;
        int[] newExtendedArray = Arrays.copyOf(arr, lengthOfNewArray);
        int index = 0;
        for (int i=lengthOfOldArray; i<newExtendedArray.length;i++){
            newExtendedArray[i] = newExtendedArray[index++]*2;
        }
	    return newExtendedArray;
    }

    public static int[] generateRandomArray(int amountOfElements) {
        int[] array = new int[amountOfElements];
        Random random = new Random();
        for(int i=0;i<amountOfElements;i++){
            array[i]=random.nextInt(100);
        }
		return array;
    }
}
