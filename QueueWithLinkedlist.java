class QueueWithLinkedlist {
    private int data;
    private QueueWithLinkedlist next,rear,front; // default value is null
    /**
     * private constructor: node can create only with in this class.
     * @param data
     */
    private QueueWithLinkedlist(int data) {
        this.data = data;
    }
    /**
     * user can create the objects of this class in outside of the class
     */
    public QueueWithLinkedlist(){
    }
    /**
     * @param value
     * accept integer type value and store it on rear  of the queue 
     * there is no overflow condition beacause we use linked list implementaion of queue
     */
    public void add(int value){
        QueueWithLinkedlist newnNode = new QueueWithLinkedlist(value);
        if(rear == null) {
            rear = front = newnNode;
            return;
        }
        rear.next = newnNode;
        rear = newnNode;
    }
    /**
     * remove front value of queue and return it.
     * @return 
     */
    public int remove(){
        try {
         int data = front.data;
         front = front.next;
         System.out.println(data);
        }catch( Exception e){
         System.out.println("queue unerflow "+e.getMessage());
        }
         return data;
    }
    /**
     * return true if queue is empty else return false
     * @return
     */
    public boolean isEmpty(){
        return front == null;
    }
}
class Queue_main{
    public static void main(String[] args) {
        QueueWithLinkedlist queue = new QueueWithLinkedlist();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove(); //underflow state

        // while( !queue.isEmpty()){
        // queue.remove();
        // }
    }
}
