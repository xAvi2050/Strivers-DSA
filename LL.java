import java.util.*;

class LL {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public int size() {
        int count = 0;
        Node currNode = head;
        while (currNode != null) {
            count++;
            currNode = currNode.next;
        }
        System.out.println("Size of the list: " + count);
        return count;
    }

    public void reverse() {
        if(head == null || head.next == null) {
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }

    public Node recursiveReverse(Node head){
        if(head == null || head.next == null) {
            this.head = head;
            return head;
        }
        Node newHead = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.printList();

        list.recursiveReverse(list.head);
        list.printList();
    }

    // ---------------------------------------------------------------------------

    // LinkedList using Collection Framework

    // public static void main(String[] args) {
    //     LinkedList<Integer> list = new LinkedList<>();

    //     list.addLast(1);
    //     list.addLast(2);
    //     list.addLast(3);
    //     list.addLast(4);

    //     System.out.println("Original List -> " + list);

    //     Collections.reverse(list);
    //     System.out.println("Reversed List -> " + list);

    //     -----------------------------------------------------------

    //     int left = 0, right = list.size() - 1;
    //     while (left < right) {
    //         int temp = list.get(left);
    //         list.set(left, list.get(right));
    //         list.set(right, temp);
    //         left++;
    //         right--;
    //     }
    //     System.out.println("Reversed List -> " + list);
    // }
}