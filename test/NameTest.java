import org.junit.Assert;
import org.junit.Test;

public class NameTest {

    @Test
    public void getFirstName_should_return_first_name() throws Exception {
        Name name = new Name("Mark","Joe");
        Assert.assertEquals("Mark",name.giveFirstName());
    }

    @Test
    public void getLatName_should_return_last_name() throws Exception {
        Name name = new Name("Mark","Joe");
        Assert.assertEquals("Joe",name.giveLastName());
    }
}
