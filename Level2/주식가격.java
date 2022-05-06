import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        List<Integer> list = new ArrayList();
        for(int i=0;i<prices.length;i++){
            if(i==prices.length-1){
                list.add(0);   
                break;
            }
            int count=1;
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<=prices[j]){
                    count++;
                    //System.out.println("i : "+i+ " count : "+count );
                    if(j==prices.length-1){
                        list.add(prices.length-i-1);
                        break;
                    }
                }
                else{
                    //System.out.println("i : "+i+ " count : "+count );
                    list.add(count);
                    break;
                }
            }
        }
        answer=new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}