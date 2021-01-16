public class PalindromNum {
    
    public boolean isPalindrom(int num){
        int revNum = 0;
        if(num < Integer.MIN_VALUE || num > Integer.MAX_VALUE || (num%10 != 0 && num != 0)){
            while(num > revNum){
                revNum = revNum * 10 + num % 10;
                num = num/10;
            }
        }
        return num == revNum || num == revNum/10;
    }
}
