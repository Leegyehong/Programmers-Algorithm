//import java.util.List;
//import java.util.ArrayList;
class Solution {
    public int solution(int n) {
            
        int answer=0;
        //List<Integer> list = new ArrayList();
        int[] arr = new int[n+1];
        //list.add(0); 
        //list.add(0); 
        arr[0]=0;
        arr[1]=0;
        
        for(int i=2;i<=n;i++){
            //list.add(1);
            arr[i]=1;
        }
            
        for(int i=2; (i*i)<=n; i++){
            if(arr[i]==1){
                for(int j=i*2;j<=n;j=j+i){
                    arr[j]=0;
                }
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                answer++;
            }
        }
        
        return answer;
    }
}