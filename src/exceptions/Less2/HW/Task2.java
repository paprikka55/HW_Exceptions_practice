/*
* Задача 2. Проверка строки на палиндром
Напишите метод, который проверяет, является ли введенная строка
палиндромом. Если строка палиндром, возвращайте "Palindrome". Если нет
— "Not a palindrome".
*
* */
package exceptions.Less2.HW;

class PalindromeChecker{
    public static boolean isPalindrome(String input){
        try {
            input = input.replace(" ", "");
            input = input.toLowerCase();
            for(int i = 0; i < input.length() / 2; i++){
                if (input.charAt(i) != input.charAt(input.length() - i - 1)){
                    return false;
                }
            }
        } catch (Exception e){
            System.err.println("Ошибка! Некорректные данные");
            return false;
        }

        return true;
    }
}

public class Task2 {
    public static void main(String[] args) {
        String input;
        //input = "A man a plan a canal Panama";
//        input = "Коту тащат уток";
        input = null;
        boolean result = PalindromeChecker.isPalindrome(input);
        System.out.println("Is the input a palindrome? " + result);
    }
}
