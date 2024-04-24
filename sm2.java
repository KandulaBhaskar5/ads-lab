import java.util.Arrays;
import java.util.Scanner;
public class sm2 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int n = arr.length;
        for (int i = 0; i<n ; i++){
            int sum=0;
            for (int j=0;j<n;j++){
               if (arr[i]+arr[j]==target){
                System.out.println(i+" "+j);
                sum++;

               }
                }
                if (sum>0){
                    break;
                }


            }
        } 
    }