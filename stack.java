/* Stack using array */
 class Stack {
    private int top = -1;
    private int array[];
    private int capacity;
    Stack(int capacity){
        this.capacity = capacity;
         array=new int[capacity];
    }
    /* push value on the top position */
    public void push(int data){
        if(isFull())
            System.out.println("stack overflow:");
        else{
            top++;
            array[top] = data;
        }
    }
    /* retrun the top value with removing */
    public int pop(){
        if(isEmpty()) {
            System.out.println("stack underflow:");
            return -1;
        }
        else{
            int value = array[top];
            top--;
             return value;
        }
    }
    /* retrun true if stack is empty else return false */
    public boolean isEmpty(){
        return top == -1;
    }
    /* retrun true if stack is full else return false */
    public boolean isFull(){
        return capacity-1 <= top;
    }
    /* retrun the top value without removing */
    public int peek(){
        if(isEmpty()) {
            System.out.println("stack underflow:");
            return -1;
        }
        return array[top];
    }
    /* print the stack */
    public void printStack(){
        for(int i=0;i<=top;i++){
            System.out.println(array[i]);
        }
    }
}

class Stackmain{
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        //stack.pop();          // stack underflow
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
      //  stack.push(60); // stack overflow
        
        stack.printStack();
    }
}