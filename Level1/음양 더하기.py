def solution(absolutes, signs):
    answer = 0
    for i in range(0,len(signs)):
        if(signs[i]):
            answer+=absolutes[i]
        else:
            answer-=absolutes[i]
    return answer