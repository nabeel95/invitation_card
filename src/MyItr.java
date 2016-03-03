
public class MyItr extends LinkList {
    public LinkList list;
    public int currentIndex;
    public Node currentNode;

    public MyItr(LinkList list,int index){
        this.list=list;
        this.currentIndex=index;
        currentNode =  (Node) list.getNodeAt(index);
    }

    public boolean hasNext(){
        return currentNode.next!=null;
    }
    public void next(){
        currentNode=currentNode.next;
    }

}
