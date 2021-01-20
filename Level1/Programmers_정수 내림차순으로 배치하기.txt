import java.util.*;
class Solution {
    public long solution(long n) {
        List<String> list = new ArrayList();
        long answer = 0;
        String num= Long.toString(n);
        char[] arr=new char[num.length()];
        
        for(int i=0;i<arr.length;i++)
            arr[i]=num.charAt(i);
        
        Arrays.sort(arr);
        String sortNum ="";
        for(int i=arr.length-1;i>=0;i--)
            sortNum=sortNum+arr[i];
        System.out.print(sortNum);
        answer=Long.parseLong(sortNum);
        return answer;
    }
}