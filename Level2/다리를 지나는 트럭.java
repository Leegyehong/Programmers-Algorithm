import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Truck> wait = new LinkedList();
        Queue<Truck> ing = new LinkedList();
        int weightsSum=0;
        for(int i=0;i<truck_weights.length;i++){
            wait.offer(new Truck(truck_weights[i],0));
        }
        int time=0;
       while(!wait.isEmpty() || !ing.isEmpty()){
           time++;
           if(!ing.isEmpty()){
               Truck t=ing.peek();
               if(time-t.pos >=bridge_length){
                   weightsSum-=t.weight;
                   ing.poll();
               }
           }
           if(!wait.isEmpty()){
               if(weightsSum+wait.peek().weight <=weight){
                   Truck t = wait.poll();
                   weightsSum=weightsSum+t.weight;
                   
                   ing.offer(new Truck(t.weight,time));
               }
           }
       }
        
        return time;
    }
    class Truck{
        int weight;
        int pos;
        Truck(int weight,int pos){
            this.weight=weight;
            this.pos=pos;
        }
    }
}