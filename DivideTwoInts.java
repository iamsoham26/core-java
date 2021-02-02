public class DivideTwoInts {
    
    public int divide(int dividend, int divisor) {
        int quo = 1;

        if(divisor > 0 && dividend > 0) {
            while((dividend-divisor) > divisor) {
                dividend = dividend-divisor;
                quo++;
            }
            return quo;
        } else if(divisor == 0 || dividend == 0){
            return 0;
        } else if(divisor == dividend) {
            return 1;
        } else {
            while((dividend+divisor) > (-divisor)) {
                dividend = dividend+divisor;
                quo++;
            }
            return -quo;
        }
    }

    public static void main(String[] args) {
        DivideTwoInts dvd = new DivideTwoInts();
        int x = dvd.divide(7, -3);
        System.out.println(x);
    }
}
