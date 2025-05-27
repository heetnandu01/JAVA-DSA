/*
decimal to binary 
eg: 5 - 101
 */

public class decimaltobinary {
    public static void main(String[] args) {
        decimaltobinary(620);
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
}


