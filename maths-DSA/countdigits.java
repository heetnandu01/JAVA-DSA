public class countdigits {
    public static void main(String[] args) {
        count(78);
        countDigitsbylog(78);
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

    public static void countDigitsbylog(int num){
        // this will not give you the right answers
         if(num ==0){
            System.out.println("Digits are : 1");
            return;
        }
        int count =(int) ((int) Math.log(num)/ Math.log(10)) +1;
        System.out.println("Digits are: " + count);
    }
}