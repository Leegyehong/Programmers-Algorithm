import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> pro = new LinkedList();
        //List<Integer> spe = new LinkedList();
        List<Integer> co = new LinkedList();
      /*  for(int i=0;progresses.length;i++){
            int days=(int)Math.ceil((double)(100-progresses[i])/speeds[i]);
            q.offer(days);
        }
        int before = q.poll();
        int count=1;*/
        int count=0;
        int x=0;
        do{
            if(progresses[x]>=100){
                x++;
                count++;
                continue;
            }else if(count>0){
                co.add(count);
                count=0;
            }
            for(int i=x;i<speeds.length;i++){
                progresses[i]+=speeds[i];
            }
            
        }while(x<speeds.length);
        co.add(count);
        answer=new int[co.size()];
        for(int i=0;i<co.size();i++){
            System.out.print(co.get(i)+" ");
            answer[i]=co.get(i);
        }
        
        
        return answer;
    }
    
}