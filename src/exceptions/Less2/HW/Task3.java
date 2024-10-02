/*Сортировка массива строк
Напишите метод, который принимает массив строк и сортирует его в
алфавитном порядке. Если входной массив null, метод должен вернуть пустой
массив и вывести сообщение об ошибке.
*/
package exceptions.Less2.HW;

import java.util.Arrays;

class StringSorter{
    public static String[] sortStrings(String[] strings){
        try{
            if (strings == null){
                System.err.println("Входной массив не может быть пустым!");
                return new String[0];
            }
            Arrays.sort(strings);
            return strings;
        } catch (Exception e){
            System.err.println("Произошла ошибка во время сортировки");
            return new String[0];
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
//        String[] string = {"banana", "apple", "cherry"};
        String[] string = null;
        String[] result = StringSorter.sortStrings(string);
        System.out.println(Arrays.toString(result));
    }
}
