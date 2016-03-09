public class Formal implements Format {
    String data;
    String res="";
    LinkList list = new LinkList();

    public Formal(String data){
        this.data=data;
        scan();
    }
    @Override
    public void scan() {
        String[] splittedData=data.split("\n");
        for (String aSplittedData : splittedData) {
            String[] splittedByComma = aSplittedData.split(",");
            Name name = new Name(splittedByComma[0],splittedByComma[1]);
            Gender gender = new Gender(splittedByComma[2]);
            Age age = new Age(Integer.parseInt(splittedByComma[3]));
            Address address = new Address(new City(splittedByComma[4]) , new State(splittedByComma[5]) , new Country(splittedByComma[6]));
            Person node = new Person(name,gender,age,address);
            list.add(node);
        }
    }

    @Override
    public String print() {
        LinkList.MyItr itr = list.listIterator(0);
        for (int i=0;i<list.length;i++){
            res+=itr.currentNode.getPrefix()+" "+itr.currentNode.getFirstName()+" "+itr.currentNode.getLastName();
            if (itr.hasNext())
                res+="\n";
            itr.next();
        }
        return res;
    }
}
