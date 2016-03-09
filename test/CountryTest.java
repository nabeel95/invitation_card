import org.junit.Assert;
import org.junit.Test;

public class CountryTest {
    @Test
    public void country_name_should_return_name_of_country() throws Exception {
        Country india = new Country("India");
        Assert.assertEquals("India",india.countryName());
    }
}
