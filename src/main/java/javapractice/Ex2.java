package javapractice;

public class Ex2 {

    static String calTargetIndex(int[] arr,int target){
        int[] index= new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target) {
                    index[0] = i;
                    index[1] = j;
                    break;
                }else
                    continue;
            }


        }
        return index[0]+" "+index[1];
    }
    public static void main(String[] args) {
        int[] arr={1,7,11,2,7};
        int target=9;
        System.out.println(calTargetIndex(arr,target));
    }
}
