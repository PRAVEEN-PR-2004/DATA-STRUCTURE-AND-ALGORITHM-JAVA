package portal;


import java.util.*;
public class Stack2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str  = str.substring(3,str.length());
        Stack<String> s  =new  Stack<>();
        String[] arr = str.split("/");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(".."))
            {
              
                s.pop();
            }
            else
            {
                s.push(arr[i]);
            }
        }
        List<String> al = new ArrayList<>();
        while(!s.isEmpty())
        {
            al.add(s.pop());
        }
        StringBuilder sb = new StringBuilder();
        for(int i=al.size()-1;i>=0;i--)
        {
            sb.append(al.get(i));
            if(i!=0)
            {
            sb.append("/");
                
            }
            
        }
        System.out.print(sb.toString());
        
    }
}
