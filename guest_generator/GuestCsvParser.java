import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GuestCsvParser {

    public static void main(String[] args) {

        String csvFile = "guests.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";

        try {
            br = new BufferedReader(new FileReader(csvFile));

            int id = 1;
            while ((line = br.readLine()) != null) {
                String[] guest = line.split(cvsSplitBy);
                String name = guest[0] + " " + guest[1];
                String tableNumber = guest[2];

                System.out.println(name.toUpperCase().replace(" ", "_").replace(",", "").replace("-", "").replace("&", "")
                            + "(" + id + ", \"" + name + "\", " + tableNumber + "),");

                id++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}