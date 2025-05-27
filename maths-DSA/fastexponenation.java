public class fastexponenation {
    public static void main(String[] args) {
        
    }


    static double exponenation(int num,int power){
        double res = 1;
        while(power > 0){
            if(power %2!=0){
                res = res * num;
            }
            power /= 2;
            num = num * num;
        }
        System.out.println(res);
        return res;
    }
}
