import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        answer= fun(n);
        return answer;
    }



    public int fun(int n){
        List<Integer> list =new ArrayList();
        list.add(0); // F0
        list.add(1); // F1
        for(int i=2;i<=n;i++){
            list.add(i,(list.get(i-2)+list.get(i-1))%1234567);
        }
        return list.get(n);
        
    }
}