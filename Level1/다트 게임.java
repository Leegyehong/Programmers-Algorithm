class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        String num="";
        int realNum=0;
        
        int[] result = new int[3];
        int cnt=0;
        boolean check=false;
        for(int i=0;i<dartResult.length();i++){
            char ch = dartResult.charAt(i);
            if(ch>=48 && ch <=57){
                if(check){
                    result[cnt]=realNum;
                    cnt++;
                    check=false;
                    num="";
                    realNum=0;
                }
                
                num=num+ch;
                realNum=Integer.parseInt(num);
                continue;
            }
            check=true;
            
            if(ch=='S'){
                realNum=(int)Math.pow(realNum,1);
            }else if(ch=='D'){
                realNum=(int)Math.pow(realNum,2);
            }else if(ch=='T'){
                realNum=(int)Math.pow(realNum,3);
            }else if(ch=='*'){
                realNum=realNum*2;
                if(cnt!=0) result[cnt-1]*=2;
            }else if(ch=='#'){
                realNum=realNum*-1;
            }
            if(cnt==2) result[cnt]=realNum;
            
        }
        for(int i=0;i<result.length;i++){
            answer=answer+result[i];
        }
        
        return answer;
    }
}