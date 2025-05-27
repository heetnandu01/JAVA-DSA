import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        first mf = new first();
        // int res = mf.CalculateArea(2, 4);
        // System.out.println(res);

        int num1 = 10;
        int num2 = 20;
        mf.swap(num1, num2);
        // System.out.println(num1 + "," + num2);
    }


    public void swap(int val1,int val2){
        System.out.println(val1 + "," + val2);
        int temp = val1;
        val1 = val2;
        val2 = temp;
        System.out.println(val1 + "," + val2);
    }


    // public int CalculateArea(int length,int width){
    //     // System.out.println(length * width);
    //     int area = length * width;
    //     return area;
    // }
}
