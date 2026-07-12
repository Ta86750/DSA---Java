public class ques7 {
    static void printDigits (int num){
        // base case
        if(num==0){
            return;
        }
        // 1 case solve krna hai
        int digit = num % 10;

        num = num / 10;
        printDigits(num);
        System.out.println(digit);

    }
    public static void main(String[] args){
        printDigits(137);
    }
}
