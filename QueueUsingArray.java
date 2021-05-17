import java.util.Scanner;

class Queue{
    int data[];
    int fi;
    int ni;
    int size;

    public Queue(int n)
    {
        data=new int[n];
        ni=0;
        fi=-1;
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

    // public void enqueue(int element)
    // {
    //     if(size==data.length)
    //     {
    //         System.out.println("queue is full ");
    //         return ;
    //     }
    //     data[ni%data.length]=element;
    //     ni++;
    //     if(fi==-1)
    //     {
    //         fi=0;
    //     }
    //     size++;
    // }

    public void enqueue(int element)
    {
        if(size==data.length)
        {
            int newData[]=new int[2*data.length];
            int j=0;
            for(int i=fi;i<data.length;i++)
            {
                newData[j]=data[i];
                j++;
            }
            for(int i=0;i<fi;i++)
            {
                newData[j]=data[i];
                j++;
            }
            data=newData;
            ni=j;
            fi=0;
        }
        data[ni%data.length]=element;
        ni++;
        if(fi==-1)
        {
            fi=0;
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
        int ans=data[fi%data.length];
        fi++;
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
        return data[fi%data.length];
    }
}

public class QueueUsingArray{
    public static void main(String args[])
    {
        Queue q=new Queue(5);
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