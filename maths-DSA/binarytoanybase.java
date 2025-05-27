public class binarytoanybase {
    public static void main(String[] args) {
        binarytoanybase(10001001, 2);
    }


    static void binarytoanybase(int binaryNum,int base){
        int resNum = 0;
        int power = 0;
        while(binaryNum > 0){
            int unitDigit = binaryNum % 10;
            binaryNum /= 10;
            resNum += unitDigit * Math.pow(base,power);
            power++;
        }

        System.out.println("Result is " + resNum);
    }
}
