import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * класс AppData - базовый класс для отбражения и хранения данных
 * @author Зюзин В.С.
 */
public class AppData {
    /**Поле для хранения массива заголовков*/
    private String[] header;
    /**Поле для хранения массива данных*/
    private int[][] data;

    /**Конструктор с пустыми параметрами*/
    public AppData() {
    }

    /**Создаёт класс для хранения данных
     * @param header - массив заголовков
     * @param data - массив данных*/
    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    /**
     * Метод возврощающий заголовкии и данные в виде строки
     * @return - строка с данными
     */
    @Override
    public String toString() {
        String stringDate = "";
        for (String word : header)
            stringDate += word + "\t";
        stringDate += "\n";
        for (int row = 0; row < data.length; row++) {
            for (int column = 0; column < data[0].length; column++) {
                stringDate += data[row][column] + "\t";
            }
            stringDate += "\n";
        }
        return stringDate;
    }

    /**
     * Возвращает значение поля {@link AppData#header}
     * @return массив строк с заголовками
     */
    public String[] getHeader() {
        return header;
    }

    /**
     * Возвращает значение поля {@link AppData#data}
     * @return массив данных состоящий из целых чисел
     */
    public int[][] getData() {
        return data;
    }
}