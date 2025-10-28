class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
       Set<Integer>set=new HashSet<>();
       for(int i=0;i<nums.length;i++){
       set.add(nums[i]);}
       int longest=1;
       for(int i:set)
       {
        if(!set.contains(i-1)){
            int x=i,c=1;
            while(set.contains(x+1))
            {
                c+=1;
                x=x+1;
            }
        longest=Math.max(longest,c);
        }
       }
       return longest;
    }
}
