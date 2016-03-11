package guestinfo;

public class Address {
    private City city;
    private State state;
    private Country country;

    public Address(City city, State state, Country country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public City getCity() {
        return this.city;
    }

    public State getState() {
        return this.state;
    }

    public Country getCountry() {
        return this.country;
    }
}
