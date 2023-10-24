import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array1[] = { 5, 10, 3, 14, 23 };
        int array2[] = { 5, 10, 3, 14, 23 };
        int result = Arrays.compareUnsigned(array1, array2);
        if(result > 0) {
            System.out.println("First array is greater than second array.");
        } else if (result == 0) {
            System.out.println("Arrays are same.");
        } else {
            System.out.println("First array is less than second array.");
        }
        System.out.println();


        int array_1[] = { 5, 10, 3, 14, 23 };
        int array_2[] = { 5, 15, 3, 14, 23 };
        int result_2 = Arrays.compareUnsigned(array_1, 0, 2, array_2, 0, 2);
        if(result_2 > 0) {
            System.out.println("First array is greater than second array.");
        } else if (result_2 == 0) {
            System.out.println("Arrays are same.");
        } else {
            System.out.println("First array is less than second array.");
        }
        System.out.println();


        int array_a1[] = { 5, 15, 3, 14, 23 };
        int array_a2[] = { 5, 10, 3, 14, 23 };
        int result_3 = Arrays.compareUnsigned(array_a1, array_a2);
        if(result_3 > 0) {
            System.out.println("First array is greater than second array.");
        } else if (result_3 == 0) {
            System.out.println("Arrays are same.");
        } else {
            System.out.println("First array is less than second array.");
        }
    }
}