import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        
        for(int i=0;i<completion.length;i++){
            for(int j=0;j<participant.length;j++){
                if(completion[i].equals(participant[j])){
                    participant[j]="";
                    break;
                }
            }
        }
        for(int n=0;n<participant.length;n++)
            if(!participant[n].equals(""))
                answer=participant[n];
        
        return answer;
    }
}