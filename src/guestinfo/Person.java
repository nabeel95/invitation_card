package guestinfo;

public class Person {
    public Person next;
    public Person previous;
    private Name name;
    private Gender gender;
    private Address address;
    private Age age;

    public Person(Name name, Gender gender, Age age, Address address) {
        this.next = null;
        this.previous = null;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
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

    public String getFirstName() {
        Name name = this.name;
        return name.giveFirstName();
    }

    public String getLastName() {
        Name name = this.name;
        return name.giveLastName();
    }

    public int getAge() {
        Age age = this.age;
        return age.getAge();
    }

    public String getPrefix() {
        Gender gender = this.gender;
        return gender.getGender().equals("Male") ? "Mr" : "Ms";
    }
}