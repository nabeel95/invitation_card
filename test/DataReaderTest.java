import org.junit.Assert;
import org.junit.Test;

public class DataReaderTest {
    @Test
    public void data_reader_should_read_the_file_and_return_data_in_string_format() throws Exception {
        DataReader reader = new DataReader("./data/dataToTest.txt");
        Assert.assertEquals("Brandt,Huel,Female,25,West Shanna,Illinois,Macedonia\n" +
                            "Velma,Bergstrom,Female,24,Katlynn view,Vermont,Macedonia\n",reader.getData());
    }
}
