class LeetCodeMain{
    public static void main(String[] args) {
        //TwoSum
        Object o = new String[]{"a","b"};
        for(String s: (String[])o){
            System.out.println(s);
        }

        System.out.println(Integer.decode("10")+
        new Integer("20")+
        Integer.valueOf("30"));
        /*TwoSum twoSumObj = new TwoSum();
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

        NextPermutationAsc nxtPrm = new NextPermutationAsc();
        int[] arr = nxtPrm.nextPermutation(new int[]{1,2,3,5,6});
        for(int i: arr){
            System.out.print(i+",");
        }*/
    }
}