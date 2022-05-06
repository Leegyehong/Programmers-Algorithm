def solution(n, arr1, arr2):
    answer = []
    num=[]
    for i in range(n):
        num.append(bin(arr1[i] | arr2[i]))
    
    for i in range(n):
        if(len(str(num[i][2:]))==n):
            answer.append(str(num[i][2:]))
        else:
            string=""
            print(num[i][2:])
            for j in range(n-len(str(num[i][2:]))):
                string+="0"
            answer.append(string+str(num[i][2:]))
           
            
        
    for i in range(n):
        answer[i]=answer[i].replace('1',"#")
        answer[i]=answer[i].replace('0'," ")
    
    return answer