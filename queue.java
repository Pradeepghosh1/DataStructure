/* Queue using array */
class Queue {
    private int capacity,rear,front = 0;
    private int array[];
    public Queue(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
    }
    public void add(int value){
        if(rear == capacity){
            System.out.println("queue is overflow");
        }else{
            array[rear] = value;
            rear++;
        }
    }
    
    public int remove(){
        if(rear == front){
            System.out.println("queue is underflow");
            return -1;
        }else{
            int data = array[front];
            System.out.println(data);
            front++;
            return data;
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
        Q.add(60);
        Q.remove();
        Q.remove();
        Q.remove();
        Q.remove();
        Q.remove();
        Q.remove();
    }
    
}