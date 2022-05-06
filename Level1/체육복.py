def solution(n, lost, reserve):
    answer = 0
    stu=[]
    for i in range(n):
        stu.append(1)
    for i in lost:
        stu[i-1]-=1
    for i in reserve:
        stu[i-1]+=1
    
    for i in range(n):
        if(i==0):
            if(stu[i+1]>1):
                stu[i+1]-=1
                stu[i]+=1
            continue
        elif(i==n-1):
            if(stu[i-1]>1):
                stu[i]+=1
                stu[i-1]-=1
            continue
        else:
            if(stu[i]<1):
                if(stu[i-1]>1):
                    stu[i]+=1
                    stu[i-1]-=1
                    continue
                elif(stu[i+1]>1):
                    stu[i]+=1
                    stu[i+1]-=1
                    continue
            continue
            
        
    for i in range(n):
        if(stu[i]>=1):
            answer+=1
    print(stu)
    return answer