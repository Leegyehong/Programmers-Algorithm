import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        List<Character> list = new ArrayList();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        while(list.size()>0){
            sb.append(list.remove(list.size()-1));
        }
        System.out.print(sb);
        
        return sb.toString();
    }
}