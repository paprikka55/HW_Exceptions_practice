package exceptions.Less1;

public class Prigram2 {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 0},{1, 0, 1},{0, 1, 0}};
        int sum;
        try {
            sum = getElSum(arr);
            System.out.printf("Сумма элементов массива: %d", sum);
        } catch (RuntimeException exception){
            System.err.println(exception.getMessage());
        }

    }

    private static int getElSum(int[][] arr) throws RuntimeException{
        int sum = 0;
        if(!checkExceptions(arr)){
            for (int[] rows : arr) {
                for (int el : rows) {
                    sum += el;
                }
            }
        }
        return sum;
    }

    private static boolean checkExceptions(int[][] arr) throws RuntimeException{
        boolean result = false;
        for (int[] rows : arr) {
            if (arr.length != rows.length) {
                result = true;
                throw new RuntimeException("Вы используете не квадратный массив!");
            }
        }
        for (int[] rows : arr) {
            for (int el : rows) {
                if (el != 0 && el != 1) {
                    result = true;
                    throw new RuntimeException("Массив содержит неподдерживаемые элементы!");
                }
            }
        }
        return result;
    }
}
