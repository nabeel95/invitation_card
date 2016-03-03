public class SecondFormat implements Format {
    String data;
    String res="";
    LinkList list = new LinkList();

    public SecondFormat(String data){
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
        for(int i=0;i<list.length;i++){
            if(itr.currentNode.gender.charAt(0)=="M".charAt(0)) {
                res+="Mr";
            }
            else if (itr.currentNode.gender.charAt(0)=="F".charAt(0))
                res+="Ms";
            res+=" "+itr.currentNode.lastName+","+itr.currentNode.firstName;
            if (itr.hasNext())
                res+="\n";
            itr.next();
        }
        return res;
    }
}
