import random

spisok = []
X = random.randint(1,100)

def creAte(l1st):

    x = 0
    cheeseburger = random.randint(5, 100)

    while x < cheeseburger:
        l1st.append(random.randint(0,9999))
        x+=1

    return l1st

def magic(l2st, a):

    sum = 0

    for i in l2st:
        sum+=i

    return sum%a==0

print(magic(creAte(spisok),X))