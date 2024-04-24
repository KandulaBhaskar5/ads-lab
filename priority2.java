import java.util.PriorityQueue;
import java.util.Collections;
public class priority2{
    public static void main(String[]args){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.add(2);
        pq.add(9);
        pq.add(100);
        pq.add(20);
        pq.add(88);
        pq.add(260);
        System.out.println(pq);
    }
}
