import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Stack<Integer> stack = new Stack();
        Queue<Printer> queue=new LinkedList();
        
        for(int i=0;i<priorities.length;i++){
            queue.offer(new Printer(i,priorities[i]));
            
        }
        while(!queue.isEmpty()){
            boolean flag=false;
            int a=queue.peek().prior;
            for(Printer p : queue){
                if(a<p.prior){
                    flag=true;
                }
            }
            if(flag)    queue.offer(queue.poll());
            else{
                if(queue.poll().num==location){
                    answer=priorities.length-queue.size();
                }
            }
        }
        return answer;
    }
    class Printer{
        int num;
        int prior;
        Printer(int num, int prior){
            this.num=num;
            this.prior=prior;
        }
    }
}