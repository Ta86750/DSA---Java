public class ques2 {
    static void printArray(int[] arr, int i) {
        //base case
        if(i>=arr.length){
            return;
        }
        //processing - 1case solve kardo
        System.out.println(arr[i]);
        //R.C
        printArray (arr,i+1);
    }
    public static  void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int i=0;
        printArray(arr,i);
    }
}
