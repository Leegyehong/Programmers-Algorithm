import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] stu = new int[n];
        
        for(int i=0;i<reserve.length;i++)
            stu[ reserve[i]-1 ]++;
        for(int i=0;i<lost.length;i++)
            stu[ lost[i]-1 ]--;
             
        for(int i=0;i<stu.length;i++){
            if(stu[i]<0){
                if(i!=stu.length-1 && stu[i+1]>0 ){
                    stu[i]++;
                    stu[i+1]--;
                }
                else if(i!=0 && stu[i-1]>0){
                    stu[i]++;
                    stu[i-1]--;
                }
            }
        }
        for(int i=0; i<stu.length;i++){
            if(!(stu[i]<0))
                answer++;
        }
        
        return answer;
    }
}