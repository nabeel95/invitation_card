import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class DataReader {
    private String fileName;

    public DataReader(String fileName) {
        this.fileName = fileName;
    }

    public String getData() {
        FileReader file;
        String text = "";
        try {
            file = new FileReader(this.fileName);
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();
            while (line != null) {
                text += line + "\n";
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}