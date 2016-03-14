package guestinfo;


public class Person {
    private String fullLine;
    private Name name;
    private Gender gender;
    private Address address;
    private Age age;

    public Person(String line) {
        this.fullLine = line;
    }

    public void initialiseValues() {
        String[] spllittedValues = this.fullLine.split(",");
        this.name = new Name(spllittedValues[0], spllittedValues[1]);
        this.gender = new Gender(spllittedValues[2]);
        this.age = new Age(Integer.parseInt(spllittedValues[3]));
        this.address = new Address(new City(spllittedValues[4]), new State(spllittedValues[5]), new Country(spllittedValues[6]));
    }

    public String getCountry() {
        Address address = this.address;
        Country country = address.getCountry();
        return country.countryName();
    }

    public String getCity() {
        Address address = this.address;
        City city = address.getCity();
        return city.cityName();
    }

    public String getState() {
        Address address = this.address;
        State state = address.getState();
        return state.stateName();
    }

    public Name getName() {
        return this.name;
    }

    public int getAge() {
        return this.age.getAge();
    }

    public String getPrefix() {
        return gender.getPrefix();
    }

    public boolean isCitizenOf(String country) {
        return this.getCountry().equals(country);
    }

    public boolean isOlderThan(int age) {
        return this.age.getAge() >= age;
    }
}