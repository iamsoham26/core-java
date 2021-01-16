class LeetCodeMain{
    public static void main(String[] args) {
        
        //TwoSum
        TwoSum twoSumObj = new TwoSum();
        int[] ans = twoSumObj.twoSum(new int[] {1, 2, 3, 4}, 7);
        for(int a: ans){
            System.out.print(a+" ");
        }

        //Is Number Palindrom
        PalindromNum palNumObj = new PalindromNum();
        System.out.println("\n"+palNumObj.isPalindrom(1234));
        System.out.println(palNumObj.isPalindrom(121));

        //Reverse Integer
        ReverseInteger revInt = new ReverseInteger();
        System.out.println(revInt.revInteger(6469));
    }
}