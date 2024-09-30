package exceptions.Less1;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4, 5};

        try{
            int[] sumArray = getSumArray(arr1, arr2);
            System.out.println("Результат: " + Arrays.toString(sumArray));
        } catch (IndexOutOfBoundsException exception){
            System.err.println(exception.getMessage());
        }
    }
    private static int[] getSumArray(int[] arr1, int[] arr2) throws IndexOutOfBoundsException{
        int[] sumArray = new int[arr1.length];
        if (arr1.length != arr2.length){
            throw new IndexOutOfBoundsException("Длины массивов не равны!");
        } else {
            for(int i = 0; i < arr1.length; i++){
                sumArray[i] = arr1[i] + arr2[i];
            }
        }
        return sumArray;
    }
}
