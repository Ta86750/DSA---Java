
//Two Sum II - Input Array Is Sorted
import java.util.*;
public class TwoSumSorted {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n-1;

        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if(sum == target) {
                return new int[]{left+1,right+1};

            }
            else if(sum > target) {
                right--;

            }
            else {
                left++;
            }
        }
        return new int[]{-1,-1};
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int [n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();

        }
        int target = sc.nextInt();
        TwoSumSorted obj = new TwoSumSorted();
        int[] answer = obj.twoSum(numbers, target);
        System.out.println(answer[0] + " " + answer[1]);
        sc.close();
    }
}
