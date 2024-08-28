package QueueArray;

public class Queue {
    int[] arr = new int[10];
    int tem;
    int current;
    Queue()
    {
        tem = -1;
        current=0;
    }
    public void enqueue(int val)
    {
        if(tem==9)
        {
            System.err.println("Queue is full");
        }
        tem=tem+1;
        arr[tem]=val;
    }
    public int dequeue()
    {
        if((tem==-1 && current==0) && current>tem)
        {
            System.out.print("queue is empty");
            return -1;
        }
        int val = arr[current];
        current++;
        return val;
    }
}
