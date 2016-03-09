import org.junit.Assert;
import org.junit.Test;

public class AgeTest {
    @Test
    public void get_age_should_return_age() throws Exception {
        Age age = new Age(20);
        Assert.assertEquals(20,age.getAge());
    }
}
