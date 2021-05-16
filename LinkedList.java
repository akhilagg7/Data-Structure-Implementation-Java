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

public class LinkedList{
    public static Scanner scn=new Scanner(System.in);
    public static void print(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data + " ");
            head=head.next;
        }
    }

    public static Node input1()
    {   
        Node head=null;
        int data=scn.nextInt();
        while(data!=-1)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
            }
            else
            {
                Node temp=head;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                temp.next=newNode;
            }
            data=scn.nextInt();
        }
        return head;
    }

    public static Node input2()
    {
        Node head=null;
        Node tail=null;
        int data=scn.nextInt();
        while(data!=-1)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
            data=scn.nextInt();
        }
        return head;
    }
    public static void main(String args[])
    {
        Node head=input2();
        print(head);
    }

}