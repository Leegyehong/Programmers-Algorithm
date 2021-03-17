def solution(nums):
    answer = 0
    count=len(nums)//2
    li=[]
    nums.sort()
    li.append(nums[0])
    for i in range(1,len(nums)):
        if(nums[i] not in li):
            li.append(nums[i])
        if(len(li)>count):
            break
    if(len(li)>count):
        answer=count
    else:
        answer=len(li)
    return answer