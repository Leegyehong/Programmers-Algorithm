class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if(s.charAt(0)=='-'){
            int num= Integer.parseInt(s.substring(1,s.length() ));
            answer=-1*num;
        }
        else{
            int num= Integer.parseInt(s.substring(0,s.length() ));
            answer=1*num;
        }
        
        return answer;
    }
}