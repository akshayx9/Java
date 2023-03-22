package Java_Basics;

public class Array2d {
    public static void main(String[] args) {
        int[][] x=new int[2][2];
        x[0][0]=100;
        x[0][1]=200;
        x[1][0]=300;
        x[1][1]=400;
        //for-each loop
        for (int[] y : x) {
            System.out.println("**********");
            for (int z : y) {
                System.out.println(z);                
            }
            
        }
    }
}
