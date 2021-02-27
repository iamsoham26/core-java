class LeetCodeMain{
    public static void main(String[] args) {
        //TwoSum
        Object o = new String[]{"a","b"};
        for(String s: (String[])o){
            System.out.println(s);
        }

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

        MergeSortedArray merge = new MergeSortedArray();
        System.err.println(merge.mergeArray(new int[]{1,2,3,0,0,0}, 3, new int[]{2,3,4}, 3));
        //jps2609134

        merge.sockMerchant(7, new int[]{1,2,1,3,2,1,2});

        merge.countingValleys(7, "UUDDUUD");

        merge.jumpingOnClouds(new int[]{0,1,0,0,1,0,0});

        NextPermutationAsc nxtPrm = new NextPermutationAsc();
        int[] arr = nxtPrm.nextPermutation(new int[]{1,2,3,5,6});
        for(int i: arr){
            System.out.print(i+",");
        }
    }
}