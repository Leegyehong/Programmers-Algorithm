def solution(array, commands):
    answer = []
    newList=[]
    for i in range(len(commands)):
        newList=array[commands[i][0]-1:commands[i][1]]
        newList.sort()
        answer.append(newList[commands[i][2]-1])
    return answer