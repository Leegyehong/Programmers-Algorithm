def solution(price, money, count):
    answer = -1
    total_price = 0
    for i in range(1,count+1):
        total_price = total_price + i*price
    print(total_price)
    if money > total_price:
        answer = 0
    else: 
        answer = total_price-money
    return answer