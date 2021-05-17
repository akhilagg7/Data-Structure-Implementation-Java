import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int data)
    {
        this.data=data;
        next=null;
    }
}

class Stack{
    Node head;
    int size;

    public Stack()
    {
        head=null;
        size=0;
    }
    
    public boolean isEmpty()
    {
        return size==0;
    }

    public int getSize()
    {
        return size;
    }

    public void push(int element)
    {
        Node newNode=new Node(element);
        newNode.next=head;
        head=newNode;
        size++;
    }

    public int pop()
    {
        if(size==0)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        int data=head.data;
        head=head.next;
        size--;
        return data;
    }

    public int top()
    {
        if(size==0)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }
}
public class StackUsingLinkedList{
    public static void main(String args[])
    {
        Stack s=new Stack();
        s.push(10);
        s.push(120);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println(s.getSize());
        System.out.println(s.isEmpty());
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        
        System.out.println(s.getSize());
        System.out.println(s.isEmpty());
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.getSize());
        System.out.println(s.isEmpty());
        System.out.println(s.top());


    }
}