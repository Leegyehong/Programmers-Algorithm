import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        List<String> list = new ArrayList();
        int left=10;
        int right=12;
        int index=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7){
                list.add("L");
                left=numbers[i];
            }else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9){
                list.add("R");
                right=numbers[i];
            }else{
                
                if(numbers[i]==0) index=11;
                else index=numbers[i];
                int x=(index-1)/3;
                int y=1;
                int leftX=(left-1)/3;
                int leftY=(left-1)%3;
                int rightX=(right-1)/3;
                int rightY=(right-1)%3;
                int leftLength=Math.abs(x-leftX)+Math.abs(y-leftY);
                int rightLength=Math.abs(x-rightX)+Math.abs(y-rightY);
                
                if(leftLength>rightLength){
                    list.add("R");
                    right=index;
                }else if(leftLength<rightLength){
                    list.add("L");
                    left=index;
                }else{
                    if(hand.equals("right")){
                        list.add("R");
                        right=index;
                    }
                    else{
                        list.add("L");
                        left=index;
                    }
                }
            }
        }
        for(int i=0;i<list.size();i++){
            answer+=list.get(i);
        }
        return answer;
    }
    
    
}