import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class queue2{
    public static void main(String[]args){
        Queue<Integer> pq = new LinkedList<>();
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        System.out.println(pq);
        Stack<Integer> s = new Stack<Integer>();
        while(pq.size()>0){
            s.push(pq.poll());
        }
        while(s.size()>0){
            pq.offer(s.pop());
            System.out.println(pq);
        }
    }
}