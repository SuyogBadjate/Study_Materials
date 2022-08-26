package FrazDSA;

import java.util.ArrayList;

public class subSetans{
    static ArrayList<ArrayList<Integer>> ans;
    static ArrayList<Integer> subSet;
    static void helper(ArrayList<Integer> v, int i, ArrayList<Integer> subSet, ArrayList<ArrayList<Integer>> ans){
        if (i == v.size()) {
            ans.add(subSet);
            return;
        }
        // include the ith element
        subSet.add(v.get(i));
        helper(v, i + 1, subSet, ans);
        // not including the ith element
        subSet.remove(i);
        helper(v, i + 1, subSet, ans);
    }
    public static void main(String[] args) {


        ArrayList<Integer> v = new ArrayList<Integer>(){
            {
                add(1);add(2);add(3);
            }
        };
        helper(v, 0, subSet, ans);
        System.out.println(ans);


    }
}