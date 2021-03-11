def solution(participant, completion):
    answer=""
    temp=""
    participant.sort()
    completion.sort()
    
    for i in range(len(completion)):
        if(not participant[i]==completion[i]):
            temp=participant[i]
            break
     
    if temp=="":
        answer=participant[len(participant)-1]
    else:
        answer=temp
    return answer