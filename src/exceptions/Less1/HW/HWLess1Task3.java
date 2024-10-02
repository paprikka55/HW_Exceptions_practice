package exceptions.Less1.HW;

import java.util.Arrays;

public class HWLess1Task3 {
    public static void main(String[] args) {
        int[] arr1 = {10, 70, 50};
        int[] arr2 = {2, 50, 54, 5};
        try{
            int[] result = subArraysWithExceptionHandling(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException exception){
            System.err.println(exception.getMessage());
        }
    }

    private static int[] subArraysWithExceptionHandling(int[] arr1, int[] arr2) throws RuntimeException{
        int[] result = new int[arr1.length];
        if (arr1.length != arr2.length){
            throw new IllegalArgumentException("Массивы разной длины");
        }
        for (int i = 0; i < arr1.length; i++){
            result[i] = arr1[i] - arr2[i];
            if (result[i] < 0){
                throw new RuntimeException("Отрицательный результат разности");
            }
        }
        return result;
    }
}
