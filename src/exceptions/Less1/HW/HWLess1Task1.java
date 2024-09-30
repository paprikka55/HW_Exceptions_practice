package exceptions.Less1.HW;

public class HWLess1Task1 {
    public static void main(String[] args) {
        String[] stringArray = {"100", "20", "3", "4"};
        try{
            int sum = convertAndSum(stringArray);
            System.out.println("Сумма элементов массива: " + sum) ;
        } catch (NumberFormatException | ArithmeticException exception){
            System.err.println(exception.getMessage());
        }
    }

    private static int convertAndSum(String[] stringArray)throws NumberFormatException, ArithmeticException{
        int sum = 0;
        for (String str: stringArray){
            sum += stringToInt(str);
        }
        if (sum > 100){
            throw new ArithmeticException("Превышен лимит суммы!");
        }
        return sum;
    }


    private static int stringToInt(String string) throws NumberFormatException{
        int result;
        try {
            result = Integer.parseInt(string);
        } catch (Exception e){
            StringBuilder sb = new StringBuilder();
            sb.append("Ошибка конвертации! Значение: ");
            sb.append(string);
            sb.append(" не может быть конвертировано в число!");
            throw new NumberFormatException(sb.toString());
        }
        return result;
    }
}
