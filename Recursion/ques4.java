public class ques4 {
    static  void findMin(int[] arr,int i, int mini) {
        // base case
        if(i >= arr.length){
            System.out.println("min value: " + mini);

            return;
        }
        if(arr[i] < mini) {
            mini = arr[i];
        }
        findMin(arr,i+1,mini);

    }
    public static  void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int i = 0;
        int mini = Integer.MAX_VALUE;

        findMin(arr,i,mini);

    }

}

