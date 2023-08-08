import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HistoricalDate {
    public static String csvFile;
    public static int column;
    public HistoricalDate(String csvFile, int column) {
         this.csvFile= csvFile;
       this.column = column;
    }

    public  ArrayList<Double> readColumnData() {
        ArrayList<Double> columnData = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                if (values.length > column) {
                    columnData.add(Double.parseDouble(values[column]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return columnData;
    }
}