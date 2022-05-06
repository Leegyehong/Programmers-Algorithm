import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;
        int num=0;
        int count=0;
        Arrays.sort(citations);
        
        for(int i=0;i<citations.length;i++){
            num=citations[i];
            count=citations.length-i;
            if(num>=count){
                answer=count;
                break;
            }
        }
        
        
        return answer;
    }
    
    
}