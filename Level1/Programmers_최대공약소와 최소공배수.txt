class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a,b;
        int temp=1;
        if(n>m){
            a=n;
            b=m;
        }
        else{
            a=m;
            b=n;
        }
        while(temp>0){
            temp=a%b;
            a=b;
            b=temp;
            
        }
       answer[0]=a;
        
       answer[1]=answer[0]*(n/answer[0])*(m/answer[0]);
        return answer;
    }
}