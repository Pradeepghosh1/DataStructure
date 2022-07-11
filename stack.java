/* Stack using array */
 class Stack {
    private int top = -1;
    int array[];
    private int capacity;
    Stack(int capacity){
        this.capacity = capacity;
         array=new int[capacity];
    }
    /* push value on the top position */
    public void push(int data){
        if(capacity-1 <= top)
            System.out.println("stack overflow:");
        else{
            top++;
            array[top] = data;
        }
    }
    /* retrun the top value with removing */
    public int pop(){
        if(top == -1) {
            System.out.println("stack underflow:");
            return -1;
        }
        else{
            int value = array[top];
            top--;
            System.out.println(value);
             return value;
        }
    }
    /* retrun the top value without removing */
    public int peek(){
        return array[top];
    }
}

class Stackmain{
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.pop();
        stack.pop();
        stack.peek();
    }
}