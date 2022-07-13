/* Queue using array */
class Queue {
    private int capacity,rear,front = 0;
    private int array[];
    public Queue(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
    }
    /**
     * @param value accept queue value and insert on from rear
     */
    public void add(int value){
        if(rear == capacity){
            System.out.println("queue is overflow");
        }else{
            array[rear] = value;
            rear++;
        }
    }
    
    /**
     * @return front value of queue if queue is full else return -1
     */
    public int remove(){
        if(rear == front){
            System.out.println("queue is underflow");
            return -1;
        }else{
            int data = array[front];
            front++;
            return data;
        }
    }
    /**
     * print the queue
     */
    public void printQueue(){
        while(front != rear){
            System.out.println(array[front]);
            front++;
        }
    }
}

class Queuemain{
    public static void main(String[] args) {
        Queue Q = new Queue(5);
        Q.add(10);
        Q.add(20);
        Q.add(30);
        Q.add(40);
        Q.add(50);
        Q.remove();
        Q.remove();
        Q.printQueue();

        // Q.remove();
        // Q.remove();
        // Q.remove();
        // Q.remove();
    }
    
}