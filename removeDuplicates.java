public class removeDuplicates {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }
        public  static void removeDuplicates(int[] nums) {
            int i =0;
            for(int j = 1; j<nums.length;j++)
            {
                if(nums[i]!=nums[j])
                {
                    nums[i+1] = nums[j];
                    i++;
                }
            }
            for(int k=0;k<=i;k++)
            System.out.print(nums[k]+" ");
        }
    }
