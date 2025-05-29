public class armstrong {
    public static void main(String[] args) {
        armstrongNum(567);
    }

    public static void armstrongNum(int num){
        int result = 0;
        int copy = num;
        while (num > 0){
            int digit = num % 10;
            result = result + (int) Math.pow(digit,3);
            num /= 10;
        }    
        System.out.println(result == copy);    
    }


}
