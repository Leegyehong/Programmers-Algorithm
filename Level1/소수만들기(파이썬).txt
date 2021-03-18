def solution(nums):
    answer = 0
    
    for i in range(len(nums)-2):
        for j in range(i+1,len(nums)-1):
            for k in range(j+1,len(nums)):
                num=nums[i]+nums[j]+nums[k]
                if(compare(num)):
                    answer+=1

    return answer


def compare(num):
    count =0
    for i in range(1,num+1):
        if(num%i==0):
            count+=1
            
    if(count==2):
        return True
    return False