import java.util.*;
class Solution {
    int count=0;
    TreeSet<String> set = new TreeSet();
    public int solution(String numbers) {
        int answer = 0;
        List<Character> arr = new ArrayList();
        List<Character> result = new ArrayList();
        for(int i=0;i<numbers.length();i++){
            arr.add(numbers.charAt(i));
        }
        
        int n1=numbers.length();
        int n2=1;
        while(n2<=n1){
            sol(arr,result,n1,n2);
            n2++;
           
        }
    
        return count;
    }
    
    public void sol(List<Character> arr,List<Character> result,int n1,int n2){
        
        if(n2==0){
            if(result.get(0)!='0'){
                String str="";
                int size=result.size();
                
                for(int i=0;i<size;i++){
                    str+=result.get(i);
                } 
                int num=0;
                if(!set.contains(str)){
                    num=Integer.parseInt(str);
                    set.add(str);
                    
                    if(isPrime(num)){
                        count++;
                    }
                }
            }
            
        }
        int num=0;
        for(int i=0;i<n1;i++){           
            result.add(arr.remove(i));
            sol(arr,result,n1-1,n2-1);
            arr.add(i,result.remove(result.size()-1));
        }        
    }
    public boolean isPrime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            
            if(n%i==0) c++;
            
        }
        if(c==2) return true;
        else return false;
    }
    
    
}