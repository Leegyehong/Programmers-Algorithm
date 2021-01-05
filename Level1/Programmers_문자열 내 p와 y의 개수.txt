class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int[] count = new int[2];
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p' || s.charAt(i)=='P')
                count[0]++;
            if(s.charAt(i)=='y' || s.charAt(i)=='Y')
                count[1]++;
        }
        if(count[0]==count[1]) answer=true;
        else answer=false;

        return answer;
    }
}