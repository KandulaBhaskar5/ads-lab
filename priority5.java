import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Scanner;
public class priority5{
    public static void main(String[]args){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            pq.offer(sc.nextInt());
            if(i<2)
            {
                System.out.println(-1);
            }
            else
            {
                int first=pq.poll();
                int second=pq.poll();
                int thrid=pq.poll();
                int res=first*second*thrid;
                System.out.println(res);
                pq.offer(first);
                pq.offer(second); 
                pq.offer(thrid);
            }
        }
    }
}
