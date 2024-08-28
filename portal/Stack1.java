package portal;


import java.util.*;
public class Stack1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String str1 = same(s1);
        String str2 = same(s2);
        if(str1.equals(str2))
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        
    }
    public static String same(String str)
    {
        Stack<Character> s =new Stack<>();
        for(char c:str.toCharArray())
        {
            if(c=='#')
            {
                s.pop();
            }
            else
            {
                s.push(c);
            }
        }
        StringBuilder sb= new StringBuilder();
        while(!s.isEmpty())
        {
            sb.append(s.pop());
        }
        //System.out.println(sb.toString());
        return sb.toString();
    }
}