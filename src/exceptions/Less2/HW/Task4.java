/*Задача 4. Нахождение среднеарифметического числа
Напишите метод, который находит среднее значение массива целых чисел.
Если массив пустой или null, метод должен вернуть Double.NaN и вывести
сообщение об ошибке.*/
package exceptions.Less2.HW;

class Statistics{
    public static double findAverage(int[] array){
        try{
            double sum = 0;
            for(int num: array){
                sum += num;
            }
            return sum / array.length;
        } catch (Exception e){
            System.err.println("Ошибка входных данных!");
            return Double.NaN;
        }
    }
}

public class Task4 {
    public static void main(String[] args) {
//        int[] array = new int[]{10, 20, 30, 40, 50, 60};
        int[] array = null;
        double average = Statistics.findAverage(array);
        System.out.println(average);
    }
}
