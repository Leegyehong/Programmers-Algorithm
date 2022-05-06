import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer=new int[commands.length];
        List<Integer> list=new ArrayList<Integer>();
        int num=0;
        for(int i=0;i<commands.length;i++){
            for(int j=commands[i][0]-1;j<commands[i][1];j++){
                list.add(array[j]);
            }
            num=list.size();
            int[] arr=new int[list.size()];
            for(int k=0;k<list.size();k++){
                arr[k]=list.get(k);    
            }
            Arrays.sort(arr);
            answer[i]=arr[commands[i][2]-1];
            list.clear();
        }
        return answer;
    }
}