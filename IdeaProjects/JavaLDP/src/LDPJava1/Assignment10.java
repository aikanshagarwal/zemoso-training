package LDPJava1;

import static LDPJava1.LinkedList.*;

public class Assignment10
{
    public static void main(String[] args)
    {

        LinkedList list = new LinkedList();

        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        insert(list, 6);
        insert(list, 7);
        insert(list, 8);



        printList(list);

        deleteNode(list,3);

        printList(list);
    }
}

class LinkedList
{
    Node head;

    static class Node<T>
    {
        T data;
        Node next;

        Node(T d)
        {
            data = d;
        }
    }

    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null)
        {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static <T> void insert(LinkedList list, T data)
    {
        Node new_node = new Node(data);
        new_node.next = null;

        //if linked list is empty
        if (list.head == null)
        {
            list.head = new_node;
        }
        else
        {
            Node last = list.head;
            while (last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public static <T> void deleteNode(LinkedList list,T value)
    {
        Node temp = list.head, prev = null;

        // If head node itself holds the value to be deleted
        if (temp != null && temp.data.equals(value))
        {
            list.head = temp.next; // Changed head
            return;
        }

        // Search for the value to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && !temp.data.equals(value))
        {
            prev = temp;
            temp = temp.next;
        }

        // If value was not present in linked list
        if (temp == null)
            return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }
}
