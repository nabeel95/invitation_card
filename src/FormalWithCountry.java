import guestinfo.*;

public class FormalWithCountry implements Format {
    String data;
    String res = "";
    LinkList list = new LinkList();
    String givenCountry;

    public FormalWithCountry(String data, String country) {
        this.givenCountry = country;
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
            if (node.getCountry().equals(givenCountry)) {
                list.add(node);
            }
        }
    }

    @Override
    public String print(String arg) {
        String result = "";
        if (arg.equals("-ffc"))
            result += printWithoutBorder();
        else if (arg.equals("-ffcb"))
            result += printWithBorder();
        return result;
    }

    @Override
    public String printWithoutBorder() {
        LinkList.MyItr itr = list.listIterator(0);
        for (int i = 0; i < list.size(); i++) {
            if (itr.currentNode.getCountry().equals(givenCountry)) {
                res += itr.currentNode.getPrefix() + " " + itr.currentNode.getFirstName() + " " + itr.currentNode.getLastName() + "," + itr.currentNode.getCountry();
                if (itr.hasNext())
                    res += "\n";
            }
            itr.next();
        }
        return res;
    }

    @Override
    public String printWithBorder() {
        LinkList.MyItr itr = list.listIterator(0);
        for (int i = 0; i < list.size(); i++) {
            if (itr.currentNode.getCountry().equals(givenCountry)) {

                int lengthOfName = itr.currentNode.getPrefix().length() + itr.currentNode.getLastName().length() + itr.currentNode.getFirstName().length();
                int lengthOfAddress = itr.currentNode.getCity().length() + itr.currentNode.getState().length();
                int length = lengthOfName > lengthOfAddress ? lengthOfName : lengthOfAddress;

                String topAndEndBorder = "+" + new String(new char[length + 4]).replace('\0', '-') + "+";

                res += topAndEndBorder + "\n" + "| " + itr.currentNode.getPrefix() + " " + itr.currentNode.getFirstName() + " " + itr.currentNode.getLastName() +
                        new String(new char[length - lengthOfName]).replace('\0', ' ') + " |" +
                        "\n" + topAndEndBorder + "\n" +
                        "| " + itr.currentNode.getCity() + ", " + itr.currentNode.getState() + new String(new char[length - lengthOfAddress]).replace('\0', '-') + " |" +
                        "\n" + "| " + itr.currentNode.getCountry() +
                        new String(new char[length - itr.currentNode.getCountry().length() + 2]).replace('\0', ' ') + " |" + "\n" + topAndEndBorder;

                if (itr.hasNext())
                    res += "\n";
                itr.next();
            }
        }
        return res;
    }
}
