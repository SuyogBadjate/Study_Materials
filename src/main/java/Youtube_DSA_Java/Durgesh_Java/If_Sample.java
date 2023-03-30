package Youtube_DSA_Java.Durgesh_Java;

public class If_Sample {
    public static void main(String[] args) {
        int n=-63;
        if(n>0){
            System.out.println("Yes it is");
        }
        else{
            System.out.println("No it is not");
        }

        int m=90;
        if(m>90){
            System.out.println("Grade A");
        }
        else if(m>80 && m<=90){
            System.out.println("Grade B");
        }
        else{
            System.out.println("FAIL");
        }

        int num=140;
        if(num>0){
            if(num%2==0){
                System.out.println("It is odd and greater than 0");
            }
        }

        if(true)
            System.out.println("Yaa it is true");
    }
}
