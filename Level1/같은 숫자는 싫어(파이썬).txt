def solution(arr):
    answer = []
    k=0
    if len(arr)!=0:
        answer.append(arr[0])
    for i in arr:
        if i!=answer[-1]:
            answer.append(i)
        k+=1
    return answer