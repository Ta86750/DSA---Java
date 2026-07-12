public class ques1 {
    static void print1toN(int n,int count) {
        //base case
        if(count > n){
            return ;

        }
        //processing
        System.out.println(count);
          //R.R
        print1toN(n,count+1);

    }
    public static  void main(String[] args){
        print1toN(5,1);
    }

}
