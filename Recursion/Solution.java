public class Solution{
    public void printName(String name,int count, int N){
        if (count == N){
            return;
        }
            System.out.println(name);
            printName(name, count + 1,N);

        
    }
        public static void main(String[] args){
            Solution sol = new Solution();
            int N = 5;
            String name = "Ashish";
            sol.printName(name,0,N);
        }
    }
