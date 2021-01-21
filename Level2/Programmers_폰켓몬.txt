import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
       // int size=nums.length/2;
        List<Integer> list = new ArrayList();
        list.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }            
        }
      /*  if(list.size()>size)
            answer=size;
        else
            answer=list.size();*/
        return (list.size()>answer) ? answer : list.size();
    }
    
}