class Node {
    int data;
    Node next;
    private  Node head; //  head for insert the value
    private  int totalNode = 0;


    private Node(int data) { /*
                              * private constructor for insert node
                              * in the class only via newnode overloaded method
                              */
        this.data = data;
    }

    Node() { // default constructor so that object being created sucessfully
    }

    /* insert at first position */
    public Node newNode(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
        totalNode++;
        return head;
    }

    /* insert at random position */
    public Node newNode(int data, int pos) {
        if (pos > totalNode) {
            System.out.println("position overflow:add wrong position ");
             return null;
        }
        Node newnode = new Node(data);
        if (pos == 0) {
            totalNode++;
            return newNode(data);
        }
        Node prev = head;
            pos--;
            for (int i = 0; i < pos; i++) {
                prev = prev.next;
            }
            newnode.next = prev.next;
            prev.next = newnode;
        
        totalNode++;
        return head;
    }

    /* function for display linked list */
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    /* function for remove node by position */
    public Node removeByPos(int pos) {
        if (pos >= totalNode) {
            System.out.println("position overflow:no remove ");
            return head;
        }
        Node prev = head;
            if(pos == 0){
                head =head.next;
                totalNode--;
                return head; 
            }
        pos--;
        for(int i=0;i<pos;i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        totalNode--;
        return head;
    }
   
    /* method return position of first appearance of value */
    public int searchByValue(int value){
        Node current = head;
        int pos = 0;
        while (current != null) {
            if(current.data == value){
                return pos;
            }
            pos++;
            current = current.next;
        }
        return -1;
    }

     /* method return node postion value */
     public int searchByPos(int pos){
        Node current = head;
        int i=0;
        while (current != null) {
            if(i == pos){
                return current.data;
            }
            i++;
            current = current.next;
        }
        return -1;
    }
}

class Linkedlist {

    public static void main(String[] args) {
        Node linkedlist = new Node();
        linkedlist.newNode(100);
        linkedlist.newNode(200);
        linkedlist.newNode(300);
        linkedlist.newNode(400);
        linkedlist.newNode(500,4);
        System.out.print(linkedlist.searchByPos(0));
    }
}
