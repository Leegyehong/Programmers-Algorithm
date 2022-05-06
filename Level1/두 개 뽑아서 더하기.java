import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int c=0;
        List<Integer> list=new ArrayList();
        for(int i=0; i<numbers.length -1; i++){
            for(int j=i+1; j <numbers.length; j++){
                c=numbers[i] + numbers[j];
                if(list.indexOf(c)<0){
                    list.add(c);
                }
            }
        }
        
        answer=new int[list.size()];
        for(int i=0; i<answer.length;i++){
            answer[i]=list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}