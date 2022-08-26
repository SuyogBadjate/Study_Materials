package GeeksForGeeksPractice;

public class SimpleFraction {

    static float fractionToDecimal(int numerator, int denominator) {
            // Code here
        float division = numerator/(float)denominator;
        System.out.println(division);
        String div = ""+division;
        int count=0;
        char[] arr = div.toCharArray();
        System.out.println(arr);
        for (int i = 0; i < div.length()-1 ; i++) {
            if(arr[i]==arr[i+1])
                System.out.println(arr[i+1]);
                count++;

        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println(fractionToDecimal(5,2));
    }
}
