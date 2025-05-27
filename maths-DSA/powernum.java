public class powernum {
    public static void main(String[] args) {
        power(10, 6);
    }


    static double power(int num,int power){
        double res = 1 ;
        for(int i =0;i<power;i++){
            res = res*num;
        }
        System.out.println(res);
        return res;
    }
}
