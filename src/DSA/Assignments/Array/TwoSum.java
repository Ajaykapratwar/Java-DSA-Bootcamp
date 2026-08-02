package DSA.Assignments.Array;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i< nums.length;i++) {
            for(int j=i;j<nums.length;j++) {
                if(target == nums[i]+nums[j]) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums,target);

        System.out.println("Indices : "+result[0]+" "+result[1]);
    }
}