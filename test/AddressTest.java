import guestinfo.Address;
import guestinfo.City;
import guestinfo.Country;
import guestinfo.State;
import org.junit.Assert;
import org.junit.Test;

public class AddressTest {
    @Test
    public void get_city_should_return_city() throws Exception {
        Address address = new Address(new City("Varanasi"),new State("UP"),new Country("India"));
        City city = address.getCity();
        Assert.assertEquals("Varanasi",city.cityName());
    }

    @Test
    public void get_state_should_return_state() throws Exception {
        Address address = new Address(new City("Varanasi"),new State("UP"),new Country("India"));
        State state = address.getState();
        Assert.assertEquals("UP",state.stateName());
    }

    @Test
    public void get_country_should_return_country() throws Exception {
        Address address = new Address(new City("Varanasi"),new State("UP"),new Country("India"));
        Country country = address.getCountry();
        Assert.assertEquals("India",country.countryName());
    }
}
