package exceptions.Less2.Practice;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        InputStream inputStream;
        try{
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings[2];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("sdafgfdaf");

        } catch (Throwable e){
            e.printStackTrace();

        }


        finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    private static void test() throws IOException, StackOverflowError{
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}
