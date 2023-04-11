/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab08.csc229_lab08;

/**
 *
 * @author dandr
 */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class SinglyLinkedList {
    Node head;

   public SinglyLinkedList() {
        head = null;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public int getSum() {
        Node currentNode = head;
        int sum = 0;
        while (currentNode != null) {
            sum += currentNode.data;
            currentNode = currentNode.next;
        }
        return sum;
    }
}

