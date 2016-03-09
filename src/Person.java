public class Person {
    Person next;
    Person previous;
    private Name name;
    private Gender gender;
    private Address address;
    private Age age;

    public Person(Name name,Gender gender,Age age,Address address){
        this.next=null;
        this.previous=null;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.address=address;
    }


    public String getCountry(){
        Country country = this.address.getCountry();
        return country.countryName();
    }
    public String getFirstName(){ return this.name.giveFirstName();}
    public String getLastName(){
        return this.name.giveLastName();
    }
    public int getAge(){
        return this.age.getAge();
    }
    public String getPrefix(){
        return this.gender.getGender().equals("Male") ? "Mr" :"Ms";
    }
}