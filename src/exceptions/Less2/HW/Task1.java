/*
Задание 1. Проверка корректности даты
Напишите метод, который проверяет, является ли введенная строка корректной
датой в формате "YYYY-MM-DD". Дата должна быть в пределах от 0001-01-01
до 9999-12-31. Если дата корректна, возвращайте её. Если нет — сообщение
об ошибке.

 */

package exceptions.Less2.HW;

class DateValidator{
    public static String validateDate(String date){
        if (date.length() != 10){
            throw new IllegalArgumentException("Неверный формат даты! Длина не может быть больше 10 символов!");
        }
        String[] arrDate = date.split("-");
        if(arrDate.length != 3){
            throw new IllegalArgumentException("Неверный формат даты! Требуемый формат \"YYYY-MM-DD\"");
        }
        if(isNotInt(arrDate[0]) || isNotInt(arrDate[1]) || isNotInt(arrDate[2])){
            throw new IllegalArgumentException("Неверный формат даты! В дате могут быть только цифры и -");
        }
        int year = Integer.parseInt(arrDate[0]);
        int month = Integer.parseInt(arrDate[1]);
        int day = Integer.parseInt(arrDate[2]);
        if(year < 1 || year > 9999){
            throw new IllegalArgumentException("Неверный формат даты! Год должен быть в диапазоне от 0001 до 9999!");
        }
        if(month < 1 || month > 12){
            throw new IllegalArgumentException("Неверный формат даты! месяц должен быть в диапазоне от 01 до 12!");
        }
        if(day < 1 || day > getMaxDayByMonth(month, year)){
            throw new IllegalArgumentException("Неверный формат даты! День не соответсвует выбранным параметрам!");
        }

        return date;
    }

    private static int getMaxDayByMonth(int month, int year){
        int maxDay = 0;
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12:
                maxDay = 31;
                break;
            case 2:
                if (isLeapYear(year)){
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
                break;
            default:
                maxDay = 30;
        }
        return maxDay;
    }

    private static boolean isNotInt(String str){
        try{
            Integer.parseInt(str);
        } catch (Exception e){
            return true;
        }
        return false;
    }

    private static boolean isLeapYear(int year){
        return year % 4 == 0;
    }
}

public class Task1 {
    public static void main(String[] args) {
        String date = "2012-02-29";
        try{
            String result = DateValidator.validateDate(date);
            System.out.println(result);
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Завершение работы...");
        }

    }
}
