import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int d)
    {
        data=d;
    }
}

class Queue{
    Node head;
    Node tail;
    int size;

    public Queue()
    {
        head=null;
        tail=null;
        size=0;
    }

    public int getSize()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public void enqueue(int element)
    {
        Node newNode=new Node(element);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }

    public int dequeue()
    {
        if(size==0)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        int ans=head.data;
        head=head.next;
        size--;
        return ans;
    }

    public int front()
    {
        if(size==0)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        return head.data;
    }
}

public class QueueUsingLinkedList{

    public static void main(String args[])
    {
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.front());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.front());
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.enqueue(90);
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.front());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        System.out.println(q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.front());

    }
}