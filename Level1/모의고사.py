def solution(answers):
    answer = []
    p1=[1,2,3,4,5]
    p2=[2,1,2,3,2,4,2,5]
    p3=[3,3,1,1,2,2,4,4,5,5]
    num=[0,0,0]
    for i in range(len(answers)):
        if(answers[i]==p1[i%5]):
            num[0]+=1
        if(answers[i]==p2[i%8]):
            num[1]+=1
        if(answers[i]==p3[i%10]):
            num[2]+=1
    
    
    max=num[0]
    if(num[1]>max):
        max=num[1]
    if(num[2]>max):
        max=num[2]
    if(max==num[0]):
        answer.append(1)
    if(max==num[1]):
        answer.append(2)
    if(max==num[2]):
        answer.append(3)
    return answer