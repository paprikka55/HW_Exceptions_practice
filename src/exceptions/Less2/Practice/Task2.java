package exceptions.Less2.Practice;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    private static final Map<String, Integer> names = new LinkedHashMap<>();

    public static void main(String[] args) {
        String filePath = "task2.txt";
        start(filePath);
        //System.out.println(isInt("?"));
    }

    private static void start(String filePath){
            readFile(filePath);
            deployHashMap();
            writeFile(filePath);
    }

    private static void deployHashMap() {
        for(Map.Entry<String , Integer> entry: names.entrySet()){
            String name = entry.getKey();
            int value = entry.getValue();
            if (value == 0) {
                entry.setValue(name.length());
            }
        }
    }

    private static void readFile(String filePath) {
        try{
            FileReader fileReader = new FileReader(filePath);
            fillHashMap(fileReader);
            fileReader.close();
        } catch (IOException e){
            System.err.println("Невозможно открыть файл: " + filePath);
        }
    }

    private static void writeFile(String filePath){
        try{
            FileWriter fileWriter = new FileWriter(filePath);
            // Заполнить файл из map
            for(Map.Entry<String, Integer> entry: names.entrySet()){
                String name = entry.getKey();
                int value = entry.getValue();
                String sb = name + "=" + value + "\n";
                fileWriter.write(sb);
            }
            fileWriter.close();
            System.out.println("Файл записан!");
        } catch (IOException e){
            System.err.println("Невозможно записать файл: " + filePath);
        }
    }


    private static void fillHashMap(FileReader fileReader) throws IOException{
        Scanner sc = new Scanner(fileReader);
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            String[] data = str.split("=");
            if(!isInt(data[1])){
                names.put(data[0], 0);
            } else {
                names.put(data[0], Integer.parseInt(data[1]));
            }
        }
        sc.close();
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
