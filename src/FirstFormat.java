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
//        MyItr itr = new MyItr(list,0);
        MyItr itr = list.listIterator(0);
        while (itr.hasNext()){

            if(itr.currentNode.gender.charAt(0)=="M".charAt(0)) {
                System.out.println(res);
                res+="Mr";
            }
            else if (itr.currentNode.gender.charAt(0)=="F".charAt(0))
                res+="Ms";
            res+=" "+itr.currentNode.firstName+" "+itr.currentNode.lastName+"\n"+itr.currentNode.city+" "+itr.currentNode.state+" "+itr.currentNode.country+"\n";
            itr.next();
        }
        return res;
    }
}
