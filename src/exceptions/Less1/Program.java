package exceptions.Less1;

class Program   {
    public static void main(String[] args) {
        int[] arr = {12, 22, 35, 44, 57, 63};
//        int[] arr = null;
        int minLength = 4;
        int value = 98;
        startUI(arr, minLength, value);
    }

    private static int getIndex(int[] arr, int minLength, int value){
        int result = -10;
        int exception = checkExceptions(arr, minLength);
        if (exception != 0){
            return exception;
        }
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                result = i;
            }
        }
        if(result == -10){
            return -2;
        }
        return result;
    }

    private static int checkExceptions(int[] arr, int minLength) {
        if (arr == null){
            return -3;
        }
        if (arr.length < minLength){
            return -1;
        }
        return 0;
    }

    private static void startUI(int[] arr, int minLength, int value){
        int result = getIndex(arr, minLength, value);
        if (result >= 0){
            System.out.println("Индекс искомого элемента: " + result);
        } else {
            switch (result){
                case -1:
                    System.err.println("Ошибка: Длинна массива меньше заданного минимума!");
                    break;
                case -2:
                    System.err.println("Ошибка: Искомый элемент не найден!");
                    break;
                case -3:
                    System.err.println("Ошибка: массив пуст (NULL)!");
            }
        }

    }

}