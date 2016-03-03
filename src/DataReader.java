import java.io.BufferedReader;
import java.io.FileReader;
class DataReader  {
    private String fileName;
    public DataReader(String fileName){
        this.fileName=fileName;
    }

    public String getData() throws Exception{
        FileReader file = new FileReader(this.fileName);
        BufferedReader reader = new BufferedReader(file);
        String text = "";
        String line = reader.readLine();
        while (line!=null) {
            text+=line+"\n";
            line=reader.readLine();
        }
        return text;
    }
}