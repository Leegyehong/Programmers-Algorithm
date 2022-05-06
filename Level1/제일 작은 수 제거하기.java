import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min=0;
        List<Integer> list = new ArrayList();
        for(int i=0;i<arr.length;i++)
            list.add(arr[i]);
        
        if(list.size()==1){
            answer= new int[1];
            answer[0]=-1;
        }
        else{
            for(int i=1;i<list.size();i++){
                if(list.get(min)>list.get(i)){
                    min=i;
                }
            }
               
            list.remove(min);
            answer=new int[list.size()];
            for(int i=0;i<list.size();i++)
                answer[i]=list.get(i);
        }
        return answer;
    }
}