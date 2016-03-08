public class Person {
    Person next;
    Person previous;
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String city;
    private String state;
    private String country;
    private String prefix;

    public Person(){
        this.next=null;
        this.previous=null;
    }

    public void insertValue(String values) {
        String []arr = values.split(",");
        this.firstName=arr[0];
        this.lastName=arr[1];
        this.gender=arr[2];
        this.age=Integer.parseInt(arr[3]);
        this.city=arr[4];
        this.state=arr[5];
        this.country=arr[6];
        if(this.gender.equals("Male")){
            this.prefix="Mr";
        }
        else if(this.gender.equals("Female")){
            this.prefix="Ms";
        }
    }

    public String getCountry(){
        return this.country;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getGender(){
        return this.gender;
    }
    public int getAge(){
        return this.age;
    }
    public String getPrefix(){
        return this.prefix;
    }
}