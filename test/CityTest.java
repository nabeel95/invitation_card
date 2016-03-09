import org.junit.Assert;
import org.junit.Test;

public class CityTest {
    @Test
    public void city_name_should_return_name_of_the_city() throws Exception {
        City city = new City("Bangalore");
        Assert.assertEquals("Bangalore",city.cityName());
    }
}
