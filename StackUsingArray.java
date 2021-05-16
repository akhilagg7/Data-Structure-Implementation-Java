import java.util.Scanner;
class Stack{
    int data[];
    int ni;

    public Stack(int n)
    {
        data=new int[n];
        ni=0;
    }

    // public void push(int element)
    // {
    //     if(ni==data.length)
    //     {
    //         System.out.println("Stack is full");
    //         return ;
    //     }
    //     data[ni]=element;
    //     ni++;
    // }   

    public void push(int element)
    {
        if(ni==data.length)
        {
            int newData[]=new int[2*data.length];
            for(int i=0;i<data.length;i++)
            {
                newData[i]=data[i];
            }
            data=newData;
        }
        data[ni]=element;
        ni++;
    }

    public int pop()
    {
        if(ni==0)
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        else
        {
            ni--;
            return data[ni];
        }
    }

    public int top()
    {
        if(ni==0)
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return data[ni-1];
        }
    }

    public int getSize()
    {
        return ni;
    }

    public boolean isEmpty()
    {
        return ni==0;
    }
}

public class StackUsingArray{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String args[])
    {
        Stack s=new Stack(5);
        s.push(20);
        s.push(30);
        s.push(200);
        s.push(350);
        System.out.println(s.getSize());
        System.out.println(s.isEmpty());
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.top());
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);   
        s.push(650);  
        s.push(400);
        s.push(540);
        s.push(680);   
        s.push(690);
        System.out.println(s.getSize());
        System.out.println(s.isEmpty());
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.top());      
    }

}