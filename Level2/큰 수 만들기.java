class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
       // String answer = "";
        int comp=0;
        int index=0;
        int n= number.length()-k;
        for(int i=0;i<n;i++){
            comp=0;
            for(int j=index;j<=i+k;j++){
                if(comp<number.charAt(j)-'0'){
                    comp=number.charAt(j)-'0';
                    index=j+1;
                }
            }
            answer.append(comp);
        }
        return answer.toString();
    }
}