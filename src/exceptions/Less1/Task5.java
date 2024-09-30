package exceptions.Less1;

public class Task5 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,2,3},{1,2, 4}};
        if(checkArrayIsSquare(arr)){
            System.out.println("Массив квадратный!");
        } else {
            System.err.println("Массив не квадратный!");
        }
    }

    private static boolean checkArrayIsSquare(int[][] arr){
        for(int[] row: arr){
            if (row.length != arr.length){
                return false;
            }
        }
        return true;
    }
}
