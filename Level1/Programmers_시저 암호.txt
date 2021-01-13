class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0;i<s.length();i++){
            char a= s.charAt(i);
            
            if(a>='a' && a<='z'){
                a=(char)(a+n);
                if(a>'z')   a-=26;
            }else if(a>='A'&&a<='Z'){
                a=(char)(a+n);
                if(a>'Z')   a-=26;
            }
            
            answer+=a;
        
        }
        return answer;
    }
}