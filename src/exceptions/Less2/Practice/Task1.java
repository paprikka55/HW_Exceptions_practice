package exceptions.Less2.Practice;

public class Task1 {
    public static void main(String[] args) {
        String[][] arr = null;//{{"1", "1", "v"}, {"1", "s", "l"}, {"1", "1"}};
        System.out.println(sum2d(arr));
    }

    private static int sum2d(String[][] arr){
        int sum = 0;
        if (arr != null) {
            for (String[] strings : arr) {
                for (String string : strings) {
                    int val = 0;
                    if (isInt(string)) {
                        val = Integer.parseInt(string);
                    }
                    sum += val;
                }
            }
        } else {
            System.err.println("Массив пустой!");
        }
        return sum;
    }

    private static boolean isInt(String str){
        try{
            Integer.parseInt(str);
        } catch (Exception e){
            return false;
        }
        return true;
    }
}
