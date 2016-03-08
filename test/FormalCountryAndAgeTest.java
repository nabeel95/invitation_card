import org.junit.Assert;
import org.junit.Test;

public class FormalCountryAndAgeTest {
    @Test
    public void formal_country_and_age_format_should_be_able_to_filter_according_country_and_age() throws Exception {
        Format data = new FormalCountryAndAge("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\nMelody,Dooley,Female,31,West Shanna,Vermont,Bangladesh","Bangladesh",31);
        Assert.assertEquals("Ms Melody Dooley,Bangladesh,31",data.print());
    }
}
