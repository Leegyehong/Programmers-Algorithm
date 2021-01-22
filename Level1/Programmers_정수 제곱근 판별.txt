class Solution {
    public long solution(long n) {
        long answer = 0;
        double num = Math.sqrt(n);
        System.out.print(num);
        if((int)num==num){
            num++;
            answer=(long)num*(long)num;
        }
        else{
            answer = -1;
        }
        return answer;
    }
}