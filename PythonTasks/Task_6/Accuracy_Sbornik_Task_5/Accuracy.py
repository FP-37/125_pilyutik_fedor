import random
import math

a = random.uniform(1000,99999)
b = random.uniform(1000,99999)

c = a + b

eps = max([a,b])*0.0001

def accuracy(A, B, C):

    rznst = C-(A+B)

    if abs(rznst)<eps:

        return True
    else:
        return False

print(accuracy(a,b,c))

"""
Для проверки работы подпрограммы можем подставить а=0.1, b=0.2, c=0.3
В таком случае a+b!=c,
разность сумм (rznst) ≈ -5*10^(-17),
а по модулю rznst будет меньше погрешности eps,
и в выводе мы сможем увидеть заслуженный true,
пропитанный духом арифметической справедливости.

Также мы можем уточнять значения дробных чисел с помощью библиотеки math:
print(math.fsum([0.1]*10) + math.fsum([0.2]*10)== math.fsum([0.3]*10))
"""