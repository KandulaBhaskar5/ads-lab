import java.util.Arrays;
import java.util.PriorityQueue;

public class queue9 {
    public static int ConnectRopes(int[] arr){
        Arrays.sort(arr);
        PriorityQueue<Integer>  pq =  new PriorityQueue<>();
        for (int length : arr){
            pq.offer(length);

        }
        int cost = 0;
        while (pq.size() > 1 ){
            int rope1 = pq.poll();
            int rope2 = pq.poll();
            int sum = rope1 + rope2;
            cost += sum;


            pq.offer(sum);
        }
        return cost;
    }
    
    public static void main(String[]args){
        int[] arr = {2,4,5,6,7,8};
        int result = ConnectRopes(arr);
        System.out.println("Minimum cost to connect ropes: "+ result);
        }
}
