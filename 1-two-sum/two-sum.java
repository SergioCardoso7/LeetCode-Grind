class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> myMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){

            int result = target - nums[i];

            if(myMap.containsKey(result)){
                return new int[]{i, myMap.get(result)};
            }
            myMap.put(nums[i], i);
                       
        }

        return new int[]{};
    }
}