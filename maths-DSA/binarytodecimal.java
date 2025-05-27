/*
binary to decimal
eg: 101 - 5
 */

public class binarytodecimal {
    public static void main(String[] args) {
        // decimaltobinary(620);
        binarytodecimal(101101);
    }

    static void decimaltobinary(int decimalNum){

        int resNum = 0;
        int power = 0;
        while (decimalNum > 0){
            int rem = decimalNum % 2;
            decimalNum /= 2;
            resNum += rem * Math.pow(10, power);
            power++;
            
        }

        System.out.println("Result is " + resNum);
    }



    static void binarytodecimal(int binaryNum){

        int resNum = 0;
        int power = 0;
        while (binaryNum > 0){
            int unitDigit = binaryNum % 10;
            binaryNum /= 10;
            resNum += unitDigit* Math.pow(2, power);
            power++;
            
        }

        System.out.println("Result is " + resNum);
    }

    



}



