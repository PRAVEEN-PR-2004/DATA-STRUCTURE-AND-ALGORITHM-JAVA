package StackArray;

public class Demo {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
       
        System.out.println(s.pop());
        s.push(7);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
