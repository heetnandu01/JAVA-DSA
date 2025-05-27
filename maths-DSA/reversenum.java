public class reversenum {
    public static void main(String[] args) {
        reversenum(2025);
    }   


    static void reversenum(int num){
        int revNum = 0;
        while(num > 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse is " + revNum);
    }
}
