def solution(lottos, win_nums):
    answer = []
    minRank = 7
    maxCount = 0
    
    for i in lottos:
        if i in win_nums:
            minRank -=1
        if i==0:
            maxCount+=1
    #print(minRank, maxCount) 
    if minRank - maxCount == 7:
        minRank-=1
    #print(minRank, minRank-maxCount)
    answer.append(minRank-maxCount)
    
    if minRank==7:
        minRank-=1
        
    answer.append(minRank)
        
 

    return answer