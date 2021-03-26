from itertools import permutations as per

def solution(numbers):
    answer = 0
    allNum=[]
    for i in range(1,len(numbers)+1):
        temp=per(numbers,i)
        for j in temp:
            allNum.append(int(''.join(j)))
    allNum = list(set(allNum))
    for i in allNum:
        if sosu(i):
            print(i)
            answer+=1
        
    
    return answer

def sosu(num):
    count=0
    for i in range(1,num+1):
        if num%i==0:
            count+=1
        if count>2:
            return False
            
    if count==2:
        return True
    else:
        return False