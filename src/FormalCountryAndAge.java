import guestinfo.*;

public class FormalCountryAndAge implements Format {
    String data;
    String res = "";
    LinkList list = new LinkList();
    String givenCountry;
    int givenAge;

    public FormalCountryAndAge(String data, String country, int age) {
        this.givenCountry = country;
        this.givenAge = age;
        this.data = data;
        scan();
    }

    @Override
    public void scan() {
        String[] splittedData = data.split("\n");
        for (String aSplittedData : splittedData) {
            String[] splittedByComma = aSplittedData.split(",");
            Name name = new Name(splittedByComma[0], splittedByComma[1]);
            Gender gender = new Gender(splittedByComma[2]);
            Age age = new Age(Integer.parseInt(splittedByComma[3]));
            Address address = new Address(new City(splittedByComma[4]), new State(splittedByComma[5]), new Country(splittedByComma[6]));
            Person node = new Person(name, gender, age, address);
            if (node.getCountry().equals(givenCountry) && node.getAge() >= givenAge) {
                list.add(node);
            }
        }
    }

    @Override
    public String print(String arg) {
        String result = "";
        if(arg.equals("-ffca"))
            result+=printWithoutBorder();
        else if (arg.equals("-ffcab"))
            result+=printWithBorder();
        return result;
    }

    @Override
    public String printWithoutBorder() {
        LinkList.MyItr itr = list.listIterator(0);
        for (int i = 0; i < list.size(); i++) {
            res += itr.currentNode.getPrefix() + " " + itr.currentNode.getFirstName() + " " + itr.currentNode.getLastName() + "," + itr.currentNode.getCountry() + "," + itr.currentNode.getAge();
            if (itr.hasNext())
                res += "\n";
            itr.next();
        }
        return res;
    }

    @Override
    public String printWithBorder() {
        return "";
    }
}
