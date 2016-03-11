package guestinfo;

public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String giveFirstName() {
        return this.firstName;
    }

    public String giveLastName() {
        return this.lastName;
    }
}
