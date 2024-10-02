package exceptions.Less1.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HWLess1Task4 {
    public static void main(String[] args) {
        String[] strings = {"Мама", "мыла", "Рому"};
        List<String> errors = new ArrayList<>();
        String target = "раму";
        String replacement = "окно";
        System.out.println("Результат: " + Arrays.toString(findAndReplace(strings, target, replacement, errors)));
        if (!errors.isEmpty()){
            System.err.print("Обнаружены ошибки: ");
            for (String err: errors){
                System.err.println(err);
            }
        }
    }

    private static String[] findAndReplace(String[] strings, String target, String replacement, List<String> errors){
        String[] result = new String[strings.length];
        boolean execReplacement = false;
        for(int i = 0; i < strings.length; i++){
            if(strings[i].equalsIgnoreCase(target)){
                execReplacement = true;
                result[i] = replacement;
            } else {
                result[i] = strings[i];
            }
        }
        if (!execReplacement){
            StringBuilder sb = new StringBuilder();
            sb.append("Искомая строка ");
            sb.append("\"");
            sb.append(target);
            sb.append("\"");
            sb.append(" не обнаружена!");
            errors.add(sb.toString());
        }
        return result;
    }
}
