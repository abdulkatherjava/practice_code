import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(numbers.contains(nums[i]))
                return true;
            numbers.add(nums[i]);
        }
        return false;
    }
}