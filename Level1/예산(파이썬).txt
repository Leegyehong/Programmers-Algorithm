def solution(d, budget):
    answer = 0
    ssum=0
    d.sort()
    for i in range(len(d)):
        ssum+=d[i]
        if(ssum>budget):
            answer+=i
            break
    
    if(ssum<=budget):
        answer=len(d)
    return answer