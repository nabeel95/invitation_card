
public class InformalWithCountry implements Format {
    String records;
    String res="";
    LinkList list = new LinkList();
    String givenCountry;
    public InformalWithCountry(String records,String country){
        this.givenCountry=country;
        this.records=records;
        scan();
    }
    @Override
    public void scan() {
        String[] splittedrecords=records.split("\n");
        for (String aSplittedrecords : splittedrecords) {
            String[] splittedByComma = aSplittedrecords.split(",");
            Name name = new Name(splittedByComma[0],splittedByComma[1]);
            Gender gender = new Gender(splittedByComma[2]);
            Age age = new Age(Integer.parseInt(splittedByComma[3]));
            Address address = new Address(new City(splittedByComma[4]) , new State(splittedByComma[5]) , new Country(splittedByComma[6]));
            Person node = new Person(name,gender,age,address);
            if(node.getCountry().equals(givenCountry)) {
                list.add(node);
            }
        }
    }

    @Override
    public String print() {
        LinkList.MyItr itr = list.listIterator(0);
        for (int i=0;i<list.length;i++){
                res += itr.currentNode.getPrefix()+" " + itr.currentNode.getLastName() + "," + itr.currentNode.getFirstName() + ","+itr.currentNode.getCountry();
                if (itr.hasNext())
                    res+="\n";

            itr.next();
        }
        return res;
    }
}