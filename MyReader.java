import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * класс MyReader -  класс для получения данных
 * @author Зюзин В.С.
 */
abstract public class MyReader {

    /**
     * Метод для считывания данных из файла
     * @param pathFile - путь к файлу с данными
     * @return - объект AppData, в котором загружены данные. Либо ошибку, если не удалось загрузить данные
     */
    public static AppData readCsvFile(String pathFile) {
        ArrayList<String[]> stringData = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringData.add(line.split(";"));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return new AppData(stringData.get(0), getDataInt(stringData));
    }

    /**
     * Метод получения данных из массива строк
     * @param stringData - массив строк с данными
     * @return - массиы целых чисел
     */
    private static int[][] getDataInt(ArrayList<String[]> stringData) {

        stringData.remove(0);
        int[][] data = new int[stringData.size()][stringData.get(0).length];

        for (int row = 0; row < stringData.size(); row++) {
            for (int column = 0; column < stringData.get(0).length; column++) {
                data[row][column] = Integer.parseInt(stringData.get(row)[column]);
            }
        }
        return data;
    }
}