public class Node {
    Node next;
    Node previous;
    public String firstName;
    public String lastName;
    public String gender;
    public int age;
    public String city;
    public String state;
    public String country;

    public Node(){
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
    }
}