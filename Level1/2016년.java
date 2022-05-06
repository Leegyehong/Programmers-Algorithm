class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int month=1;
        int date=1;
        int fDay=5;
        int[] dateOfMonth={31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day={"SUN","MON","TUE","WED","THU","FRI","SAT"};
        if(month==a && date==b)
            answer="FRI";
        while(true){
            date++;
            fDay++;
            if(date==dateOfMonth[month-1]+1){
                date=1;
                month++;
                if(month==13) break;
            }
            if(fDay==7) fDay=0;
            
            if(month==a && date==b){           
                answer=day[fDay];
                break;
            }
        }
        
        return answer;
    }
}