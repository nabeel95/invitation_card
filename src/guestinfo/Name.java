package guestinfo;

public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFormalRepresentation(){
        return this.firstName+" "+this.lastName;
    }

    public String getInformalRepresentation(){
        return this.lastName+","+this.firstName;
    }
    public String giveFirstName() {
        return this.firstName;
    }

    public String giveLastName() {
        return this.lastName;
    }
}
