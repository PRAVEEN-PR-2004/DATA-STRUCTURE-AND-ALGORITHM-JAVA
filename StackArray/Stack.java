package StackArray;

public class Stack {
    int[] arr = new int[10];
    int tos;
    Stack()
    {
        tos  =-1;
    }
    void push(int val)
    {
        if(tos==9)
        {
            System.out.print("Stack is full");
            return;
        }
        tos = tos+1;
        arr[tos]=val;
    }
    int pop()
    {
        if(tos<0)
        {
            System.out.print("Stack is empty");   
            return -1;
        }
        else
        return arr[tos--];
    }
    int peek()
    {
        return arr[tos];
    }
}
