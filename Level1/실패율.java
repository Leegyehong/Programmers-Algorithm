import java.util.Arrays;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        info[] fails = new info[N];
        
        double count;
        double noClear;
        for(int i=1;i<=N;i++){
            count=0;
            noClear=0;
            for(int j=0;j<stages.length;j++){
                if(stages[j]>=i){
                    count++;
                    if(stages[j]==i)
                        noClear++;                
                }
            }
            if(count==0) fails[i-1]=new info(i,0);
            else    fails[i-1]=new info(i,noClear/count);
        }
        Arrays.sort(fails,(o1,o2)->{
            return Double.compare(o2.fail,o1.fail);
        });
        for(int i=0;i<N;i++){
            answer[i]=fails[i].num;
        }
        
        return answer;
    }
    
    class info{
        int num;
        double fail;
        info(int num,double fail){
            this.num=num;
            this.fail=fail;
        }
    }
    
}