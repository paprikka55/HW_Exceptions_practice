package exceptions.Less1.HW;

import java.util.Arrays;

public class HWLess1Task2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4};
        int[] arr2 = {2, -2, 4, 5};
        try{
           int[] result = mergeAndValidateArrays(arr1, arr2);
            System.out.println(Arrays.toString(result));
        } catch (RuntimeException exception){
            System.err.println(exception.getMessage());
        }
    }

    private static int[] mergeAndValidateArrays(int[] arr1, int[] arr2) throws RuntimeException {
        int[] result = new int[arr1.length];
        if (arr1.length != arr2.length){
            throw new IllegalArgumentException("Длины массивов не совпадают!");
        }
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] < 0 || arr2[i] < 0){
                throw new RuntimeException("Обнаружен отрицательный элемент");
            }
            result[i] = arr1[i] + arr2[i];
        }
        return result;
    }
}
