public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    private int size = 0;
    public MyLinkedListQueue(){
        this.head =null;
        this.tail =null;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if(this.tail ==null){
            this.tail = this.head = temp;
            return;
        }
        this.tail.next =temp;
        this.tail =temp;

        size++;
    }
    public Node dequeue(){
        if(this.head ==null){
            return null;
        }
        Node temp =this.head;
        this.head =this.head.next;
        //1 node only
        if(this.head==null){
            this.tail =null;
        }
        return temp;
    }
}
