public class ReverseInteger {
    
    public int revInteger(int value){
        long rev = 0;
        while(value != 0){
            rev = rev*10 + value%10;
            value = value/10;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        return (int) rev;
    }
}
