class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> s = new Stack<>();
        for(int i=2*nums.length-1 ; i>=0 ; i--){
            int curr = nums[i%nums.length];
            while(!s.isEmpty() && s.peek() <= curr){
                s.pop();
            }
            if(i < nums.length){
                if(s.isEmpty()){
                    ans[i] = -1;
                }
                else{
                    ans[i] = s.peek();
                }
            }
            s.push(curr);
        }
        return ans;
    }
}