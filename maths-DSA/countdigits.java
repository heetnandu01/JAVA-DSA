public class countdigits {
    public static void main(String[] args) {
        count(01245);
    }



    public static void count(int num){
        if(num ==0){
            System.out.println("Digits are : 1");
            return;
        }
        int counter = 0;
        while (num > 0){
            num /= 10;
            counter++;
        }

        System.out.println("Result is: "+ counter);
    }
}