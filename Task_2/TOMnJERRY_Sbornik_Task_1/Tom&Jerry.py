S = float(input())
X = float(input())
Y = float(input())

def TomHaveADinner(tom,jerry):
    if tom>jerry:
        t = S/(tom-jerry)
        t = round(t,2)
        print("Том пообедает через ",t," секунд!!!")
    else:
        print("Том останется голодным.")

TomHaveADinner(Y,X)

#Том в любом случае останется голодным, т.к. он не рассматривает Джерри в качестве еды.
#Ну и ладно. Не будем лезть в их отношения.