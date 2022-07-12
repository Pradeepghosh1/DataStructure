class StackWithLinkedlist {
    private int data;
    private StackWithLinkedlist next,headNode;
    /**
     * private constructor: node can create only with in this class.
     * @param data
     */
    private StackWithLinkedlist(int data) {
        this.data = data;
    }
    /**
     * user can create the objects of this class in outside of the class
     */
    public StackWithLinkedlist(){
    }
    /**
     * @param value
     * accept integer type value and store it on head or top of the stack 
     * there is no overflow condition beacause we use linked list implementaion of stack
     */
    public void push(int value){
        StackWithLinkedlist newnNode = new StackWithLinkedlist(value);
        newnNode.next = headNode;
        headNode = newnNode;
    }
    /**
     * if sucess remove top value of stack and return it.else return negetive number
     * @return 
     */
    public int pop(){
        if(headNode == null){
             System.out.println("Stack underflow:");
            return -1;
        }else{
            int lastValue = headNode.data;
            System.out.println(lastValue);
            headNode = headNode.next;
            return lastValue;
        }
        
    }
}
class Nodemain{
    public static void main(String[] args) {
        StackWithLinkedlist stack = new StackWithLinkedlist();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // underflow state 
    }
}