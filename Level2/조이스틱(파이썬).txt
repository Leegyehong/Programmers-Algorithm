def solution(name):
    answer = 0
    name=list(name)
    before=["A"]*len(name)
    idx=0
    while(True):
        rightIdx=1
        leftIdx=1
        if name[idx]!="A":
            if ord(name[idx])-ord("A")>13:
                answer+=26-(ord(name[idx])-ord("A"))
            else:
                answer+=ord(name[idx])-ord("A")
            name[idx]="A"
        if name == before:
            break
        
        else:
            for i in range(1,len(name)):
                if name[idx+i]=="A":
                    rightIdx+=1
                else:
                    break
                    
                if name[idx-i]=="A":
                    leftIdx+=1
                else:
                    break
                
            if rightIdx>leftIdx:
                answer+=leftIdx
                idx-=leftIdx
            else:
                answer+=rightIdx
                idx+=rightIdx
    return answer