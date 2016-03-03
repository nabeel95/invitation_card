
public class Invitation {
    private String fileName;
    String data;
    public Invitation(String fileName) throws Exception {
        readData(fileName);
    }

    public void readData(String fileName) throws Exception {
        DataReader reader = new DataReader(fileName);
        this.data = reader.getData();
    }

    public String getFomatOne(){
        Format format = new FirstFormat(this.data);
        return format.print();
    }

    public String getFormatTwo(){
        Format format = new SecondFormat(this.data);
        return format.print();
    }

}
