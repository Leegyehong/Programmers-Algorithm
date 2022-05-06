import java.util.*;
class Solution {
    public String solution(String new_id) {
        List<Character> list=new ArrayList();
        List<Character> newList=new ArrayList();
        String answer = "";
        new_id=new_id.toLowerCase();
        for(int i=0;i<new_id.length();i++){
            char c=new_id.charAt(i);
            if(c>='0' && c<='9')
                list.add(c);
            else if(c>='a' && c<='z')
                list.add(c);
            else if(c=='-' || c=='_' || c=='.')
                list.add(c);                
        }
      
        char ch = list.get(0);
        newList.add(ch);
        int size=list.size();
        for(int i=1;i<size;i++){
            char c=list.get(i);
            if(c=='.' && c==ch){
        
                continue;
            }else{
                newList.add(c);
            }
            ch=c;
        }
        
        if(newList.size()==1){
            if(newList.get(0)=='.')
                newList.remove(0);
        }else if(newList.size()>1){
            if(newList.get(0)=='.')
                newList.remove(0);
            if(newList.get(newList.size()-1)=='.')
                newList.remove(newList.size()-1);
        }
        
        if(newList.size()==0)
            newList.add('a');
        
        if(newList.size()>=16){
            while(newList.size()!=15){
                newList.remove(newList.size()-1);
                
            }
            if(newList.get(newList.size()-1)=='.')
                    newList.remove(newList.size()-1);
        }
        if(newList.size()<=2){
            while(newList.size()!=3){
                char a=newList.get(newList.size()-1);
                newList.add(a);
            }
        }    
        
        for(int i=0;i<newList.size();i++)
            answer+=newList.get(i);
        System.out.print(answer);
        return answer;
    }
}