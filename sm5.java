import java.util.HashMap;
import java.util.Map;

public class sm5 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -1, 3, 2};
        int[] result = findFirstNonRepeating(arr);
        if (result.length == 0) {
            System.out.println("There is no non-repeating element in the array.");
        } else {
            System.out.println("The first non-repeating element is " + result[0]);
        }
    }

    public static int[] findFirstNonRepeating(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (countMap.get(num) == 1) {
                return new int[]{num};
            }
        }

        return new int[0];
    }
}