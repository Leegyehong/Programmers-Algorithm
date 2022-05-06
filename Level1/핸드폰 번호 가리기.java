import java.util.*;
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        List<String> list = new ArrayList();
        for(int i=0;i<phone_number.length();i++){
            if(i>=phone_number.length()-4)
                list.add(phone_number.charAt(i)+"");
            else
                list.add("*");
            
        }
        for(int i=0;i<list.size();i++){
            answer=answer+list.get(i);
        }
        
        return answer;
    }
}