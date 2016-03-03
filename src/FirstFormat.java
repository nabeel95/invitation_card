public class FirstFormat implements Format {
    String data;
    String res="";
    LinkList list = new LinkList();

    public FirstFormat(String data){
        this.data=data;
        scan();
    }
    @Override
    public void scan() {
        String[] splittedData=data.split("\n");
        for (String aSplittedData : splittedData) {
            Node node = new Node();
            node.insertValue(aSplittedData);
            list.add(node);
        }
    }

    @Override
    public String print() {
        MyItr itr = list.listIterator(0);
        for (int i=0;i<list.length;i++){
            if(itr.currentNode.gender.equals("Female")) {
                res+="Ms";
            }
            else if (itr.currentNode.gender.equals("Male"))
                res+="Mr";
            res+=" "+itr.currentNode.firstName+" "+itr.currentNode.lastName;
            if (itr.hasNext())
                res+="\n";
            itr.next();
        }
        return res;
    }
}
