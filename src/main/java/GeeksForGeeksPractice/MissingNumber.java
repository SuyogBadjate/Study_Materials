//Find the Missing Number
package GeeksForGeeksPractice;
public class MissingNumber {
    static int MissingNumberSum(int[] array, int n) {
        // Your Code Here
        int sum=(n+1)*(n+2)/2;
        for(int i=0;i<n;i++){
            sum -= array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
          int[] array={1,2,3,5};
          int n= array.length;
          System.out.println(MissingNumberSum(array,n));
    }
}
