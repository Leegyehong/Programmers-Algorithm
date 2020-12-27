import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        int n1=1;
        int n2=1;
        int n3=3;
        int a=0,b=0,c=0;
        for(int i=0;i<answers.length;i++){
            
            if(answers[i]==n1){
                a++;
            }
            
            if(i%2==0){
                if(answers[i]==2)
                    b++;
            }else{
                if(answers[i]==n2)
                    b++;
                
                if(n2==1)
                    n2=3;
                else{
                    n2++;
                    if(n2==6)
                        n2=1;
                    
                }
            }
            
            if(answers[i]==n3){
                c++;               
            }
                
            if(n1==5)
                n1=1;
            else
                n1++;
            
            if(i>0&& i%2==1 ){
                if( n3==3)
                    n3=1;
                else if(n3==2)
                    n3=4;
                else if(n3==5)
                    n3=3;
                else
                    n3++;
            }
        }
        int max=a;
        if(b>max)
            max=b;
        if(c>max)
            max=c;
               
        if(max==a);
            list.add(1);
        if(max==b)
            list.add(2);
        if(max==c)
            list.add(3);
        answer=new int[list.size()];
        for(int i=0;i<answer.length;i++)
            answer[i]=list.get(i);
    
        return answer; 
    }
}