public class ques5 {
    static int findTarget(int[] arr, int i, int target) {
        if (i >= arr.length) {
            return -1;

        }
        if (arr[i] == target)
            return i;
        int ans = findTarget(arr, i + 1, target);
        return ans;
    }
        public static  void main(String args[]) {
        int [] arr = {10,20,30,40,50};
        int i = 0;
        int target = 40;
        int ans = findTarget(arr, i, target);
        System.out.println("Found  at index:" + ans);
    }
}
