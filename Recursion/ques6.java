public class ques6 {
    static void countTarget(int[] arr,int i,int target,int count) {
        //base case
        if(i>= arr.length){
            System.out.println("Count: " + count);
            return;
        }
        // 1 case solve karenge
        if(arr[i] == target){
            count++;
        }
        // R.C
        countTarget(arr,i+1, target,count);

    }
    public static  void main(String[] args){
        int arr[] = {10,10,30,40,50};
        int i = 0;
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        int target= 10;
        int count = 0;
        countTarget(arr,i,target,count);
    }
}
