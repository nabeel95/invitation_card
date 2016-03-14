import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DataReaderTest {
    @Test
    public void data_reader_should_read_the_file_and_return_data_in_list() throws Exception {
        DataReader reader = new DataReader("./data/dataToTest.txt");
        List list = reader.getData();
        Assert.assertEquals(2,list.size());
    }
}
