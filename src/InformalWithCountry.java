
public class InformalWithCountry implements Format {
    String data;
    String res="";
    LinkList list = new LinkList();
    String givenCountry;
    public InformalWithCountry(String data,String country){
        this.givenCountry=country;
        this.data=data;
        scan();
    }
    @Override
    public void scan() {
        String[] splittedData=data.split("\n");
        for (String aSplittedData : splittedData) {
            Person node = new Person();
            node.insertValue(aSplittedData);
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