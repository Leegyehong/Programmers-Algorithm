import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++){
            
            if(i==arr.length-1){
                list.add(arr[i]);
                break;
            }
            
            for(int j=i+1;j<arr.length;j++){
            
                if(arr[i]!=arr[j]){
                    list.add(arr[i]);
                    i=j-1;
                    break;
                }                
            }            
        }
        answer=new int[list.size()];
        
        for(int i=0;i<list.size();i++)
            answwer[i]=list.get(i);
        
        return answer;
    }
}