import java.io.*;
import java.util.Scanner;
/**
 * класс Main - базовый класс для запуска программы
 * @author Зюзин В.С.
 */
public class Main {
    /**
     * основной метод для запуска программы
     * @param args
     */
    public static void main(String[] args) {
        MyWriter.saveInCsvFile(new String[]{"Value 1", "Value 2", "Value 3"}, new int[][]{{100, 200, 123}, {300, 400, 500}});
        AppData dataOne = MyReader.readCsvFile("file.csv");
        System.out.println(dataOne);


        AppData dataTwo = new AppData(new String[]{"qwe", "qwe"}, new int[][]{{1, 2}, {3, 4}});
        MyWriter.saveInCsvFile(dataTwo);
        System.out.println("\n" + MyReader.readCsvFile("file.csv"));

    }
}