public class LinkList {
    public Person first;
    public Person last;
    public int length;

    public LinkList(){
        this.first=null;
        this.last=null;
        this.length=0;
    }

    public int add(Person node){
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

    private Object getNodeAt(int index){
        Person node = this.first;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public class MyItr {
        public LinkList list;
        public int currentIndex;
        public Person currentNode;

        public MyItr(LinkList list,int index){
            this.list=list;
            this.currentIndex=index;
            currentNode =  (Person) list.getNodeAt(index);
        }

        public boolean hasNext(){
            return currentNode.next!=null;
        }
        public void next(){
            currentNode=currentNode.next;
        }

    }

    public MyItr listIterator(int index){
        return new MyItr(this,index);
    }

}
