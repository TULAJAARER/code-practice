class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         boolean[] present = new boolean[nums.length + 1];

        // Mark numbers that are present
        for (int num : nums) {
            present[num] = true;
        }

        // Find numbers that are not present
        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (!present[i]) {
                ans.add(i);
            }
        }

        return ans;
        
    }
}