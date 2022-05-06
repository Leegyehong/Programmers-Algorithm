import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int n2=n;
        int num=0;
        Stack<Integer> st = new Stack<Integer>();
        while(n2>0){
            num=n2%3;
            st.push(num);
            n2=n2/3;            
        }
        List<Integer> list = new ArrayList<Integer>();
        
        while(st.size()>0){
            list.add(st.pop());
        }
        
        for(int i=0;i<list.size();i++){
       
            int temp=list.get(i)*(int)Math.pow(3,i);
            answer=answer+temp;
        }
        return answer;
    }
}