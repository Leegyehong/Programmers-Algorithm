class Solution {
    public int[] solution(long n) {
        int i=0;
        int[] answer = {};
        int size=(Long.toString(n)).length();
        answer=new int[size];
        while(n>0){
                      
            answer[i]=(int)(n%10);
            n/=10;
            i++;
        }
        return answer;
    }
}