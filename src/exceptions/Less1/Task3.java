package exceptions.Less1;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, null, 5, null, 6};
        List<Integer> badElIndexes = checkArray(arr);
        if(badElIndexes.isEmpty()){
            System.out.println("Массив соответсвует требованиям задачи!");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Индексы элементов со значением NULL: ");
            for(int i = 0; i < badElIndexes.size(); i++){
                sb.append(badElIndexes.get(i).toString());
                if (badElIndexes.size() != i + 1){
                    sb.append(", ");
                }
            }
            System.out.println(sb.toString());
        }
    }

    private static List<Integer> checkArray(Integer[] arr){
        List<Integer> badElIndexes = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == null){
                badElIndexes.add(i);
            }
        }
        return badElIndexes;
    }
}
