import java.util.PriorityQueue;
import java.util.Collections;
public class priority1{
    public static void main(String[]args){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.add(2);
        pq.add(9);
        pq.add(100);
        pq.add(20);
        pq.add(88);
        pq.add(260);
        System.out.println(pq);
         pq.poll();
         System.out.println(pq);
        pq.remove(9);
        System.out.println(pq);
        pq.peek();
        System.out.println(pq);
         pq.size();
         System.out.println(pq);
    }
}