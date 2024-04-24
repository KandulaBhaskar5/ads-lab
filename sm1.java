import java.util.Scanner;
public class sm1{

    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int target=9;
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(i+""+j);
                    c++;
                }
            }
            if(c>0)
            {
                break;
            }

        }


    }
}
