package DoublyLinkedList;

public class CustomLinkedList {
    int noOfNodes;
    Node head;
    Node tail;

    public CustomLinkedList(int value) {
        Node newNode = new Node(value );
        head = newNode;
        tail = newNode;
        head.prev = null;
        tail.next = null;
        noOfNodes++;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public int size() {
        return noOfNodes;
    }

    public void print() {
        Node currentNode = head;
        while (true) {
            System.out.println(currentNode.getValue());
            if (currentNode.hasNext(currentNode)) {
                currentNode = currentNode.next;
            } else {
                break;
            }
        }
    }//end of the method

    public void insert(int value) { // We add to end of the list. Like append method.
        Node newNode = new Node(value);
        if (noOfNodes == 1) {
            head.next = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = null;
        tail = newNode;
        noOfNodes = noOfNodes + 1;
    }

    public void insert(int value, int location) { // We add to specific location on linkedList.

        Node newNode = new Node(value);
        Node currentNode = head;

        if (location == noOfNodes ){
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }else{
            for (int i = 0; i < location; i++) {
                currentNode = currentNode.next;
            }
            if (currentNode == head) {
                head.prev = newNode;
                newNode.next = head;
                head = newNode;
                newNode.prev = null;
            } else if (currentNode == tail) {
                Node before = tail.prev;
                tail.prev = newNode;
                before.next = newNode;
                newNode.prev = before;
                newNode.next = tail;
                return;
            } else {
                Node prevCurrent = currentNode.prev;
                prevCurrent.next = newNode;
                currentNode.prev = newNode;
                newNode.next = currentNode;
                newNode.prev = prevCurrent;
            }
        }
        noOfNodes++;
    }

    public void deleteByName(int value) { //It is easy to understand if you read the name of method.
        if (!isContainValue(value)) {
            System.out.println("Does not contain with: " + value);
            return;
        }
        Node currentNode = head;
        while (true) {
            if (currentNode.getValue() == value) {
                break;
            }
            currentNode = currentNode.next;
        }
        if (currentNode == head) {
            head = head.next;
            currentNode.next = null;
            head.prev = null;
        } else if (currentNode == tail) {
            tail = tail.prev;
            tail.next = null;
            currentNode.prev = null;
        } else {
            Node prev1 = currentNode.prev;
            Node next1 = currentNode.next;
            prev1.next = next1;
            next1.prev = prev1;
            currentNode.next = null;
            currentNode.prev = null;
        }
        System.out.println("The process done");
        noOfNodes--;
    }

    public void deleteByIndex(int index) { /* In this method I deleted Node with index of the LinkedList.
                                            The process nearly same as deletedByName Methods  */
        if (noOfNodes <= index) {
            System.out.println("System out of range !!");
            return;
        }
        Node currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        if (currentNode == head) {
            head = head.next;
            currentNode.next = null;
            head.prev = null;
        } else if (currentNode == tail) {
            tail = tail.prev;
            tail.next = null;
            currentNode.prev = null;
        } else {
            Node prev1 = currentNode.prev;
            Node next1 = currentNode.next;
            prev1.next = next1;
            next1.prev = prev1;
            currentNode.next = null;
            currentNode.prev = null;
        }
        System.out.println("The process done");
        noOfNodes--;
    }


    public boolean isContainValue(int value) { //This method wasn't wanted. I added this method to my class. It might be useful.
        Node currentNode = head;
        while (true) {
            if (currentNode.getValue() == value) {
                return true;
            }
            if (!currentNode.hasNext(currentNode)) {
                break;
            }
            currentNode = currentNode.next;
        }
        return false;
    }


}









