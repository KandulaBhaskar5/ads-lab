import java.util.Queue;
import java.util.LinkedList;
public class queue{
    public static void main(String[]args){
     Queue <Object> q = new LinkedList<>();
     q.add(2);
     q.add(9);
     q.add("hello");
     System.out.println(q);   
    }
}