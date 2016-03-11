import guestinfo.*;

public class Formal implements Format {
    String data;
    String res = "";
    LinkList list = new LinkList();

    public Formal(String data) {
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
            list.add(node);
        }
    }

    @Override
    public String print(String arg) {
        String result = "";
        if (arg.equals("-ff"))
            result += printWithoutBorder();
        else if (arg.equals("-ffb"))
            result += printWithBorder();
        return result;
    }

    @Override
    public String printWithoutBorder() {
        LinkList.MyItr itr = list.listIterator(0);
        for (int i = 0; i < list.size(); i++) {
            res += itr.currentNode.getPrefix() + " " + itr.currentNode.getFirstName() + " " + itr.currentNode.getLastName();
            if (itr.hasNext())
                res += "\n";
            itr.next();
        }
        return res;
    }

    @Override
    public String printWithBorder() {
        LinkList.MyItr itr = list.listIterator(0);
        for (int i = 0; i < list.size(); i++) {
            int length = itr.currentNode.getPrefix().length() + itr.currentNode.getFirstName().length() + itr.currentNode.getLastName().length();
            String topAndEndBorder = "+" + new String(new char[length + 4]).replace('\0', '-') + "+";

            res += topAndEndBorder + "\n" + "| " + itr.currentNode.getPrefix() + " " + itr.currentNode.getFirstName() + " " + itr.currentNode.getLastName() + " |" + "\n" + topAndEndBorder;
            if (itr.hasNext())
                res += "\n";
            itr.next();
        }
        return res;
    }
}
