class Solution {
    public int solution(long num) {
        int answer = 0;
        int count=0;
        while(num!=1){
            if(num%2==0){
                num=num/2;
                count++;
            }
            else{
                num=num*3;
                num++;
                count++;
            }
            if(count==500){
                
                count=-1;
                break;
            }
        }

        answer=count;
        return answer;
    }
}