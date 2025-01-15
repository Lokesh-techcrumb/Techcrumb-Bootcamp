package LinkedList;

public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public  int size;

    public void addFirst(int data){
        //step 1: create NewNode
        Node newNode = new Node(data);
        size++;
        //step 2: Check Head is NULL or Not
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 3: newNode linked with head Node
        newNode.next = head;

        //step 4: update head
        head = newNode;
    }

    public void addLast(int data){
        //step 1: create NewNode
        Node newNode = new Node(data);
        size++;
        //step 2: Check Head is NULL or Not
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 3: newNode linked with head Node
        tail.next = newNode;

        //step 4: update head
        tail = newNode;
    }

    public void addMiddle(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }

        Node temp = head;
        int i = 0;
        Node newNode = new Node(data);
        size++;

        while(i < index-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LinkedList Is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LinkedList Is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i = 0; i < size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void print(){
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            if(temp.next == null){
                System.out.print(temp.data);
            }
            else{
                System.out.print(temp.data + "->");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // Add elements in last of the linkedlist
        for(int i = 1; i <= 5; i++){
            ll.addLast(i);
        }

        ll.print();
        System.out.println(ll.size);

        //Add element in the middle of the LinkedList
        ll.addMiddle(2,7);
        ll.print();

        System.out.println(ll.size);
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        //Remove element From Starting point of the LinkedList
        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);

        // Remove element from Last point of the LinkedList
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);

    }
}
