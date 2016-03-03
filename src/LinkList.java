public class LinkList {
    public Node first;
    public Node last;
    public int length;

    public LinkList(){
        this.first=null;
        this.last=null;
        this.length=0;
    }

    public int add(Node node){
        if(this.length==0){
            this.first=node;
            this.last=node;
        }
        else {
            node.previous=this.last;
            this.last.next=node;
            this.last=node;
        }
        this.length++;
        return this.length;
    }

    public Object getNodeAt(int index){
        Node node = this.first;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public MyItr listIterator(int index){
        return new MyItr(this,index);
    }

}
