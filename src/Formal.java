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
            Person node = new Person();
            node.insertValue(aSplittedData);
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
