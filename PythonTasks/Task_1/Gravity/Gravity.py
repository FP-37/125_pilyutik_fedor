
import math #добавляем библиотеку (решать м@тешу)

G = 6.6743 * math.pow(10,-11)
mZe = 5.976 * math.pow(10,24)

#а это наши константы – гравитационная постоянная и масса земли

def sila(mass, dist):
    F = (G * mZe * mass)/math.pow(dist,2)
    return F

#знания – сила
#а sila – функция, забирающая массу и дистанцию до Земли второй планеты и возвращающая силу притяжения

print("К какой планете собираемся притягиваться?")
name = str(input())
print(name)

print("Введите массу планеты: ")
mFirstPart = float(input())
print("Масса = ", mFirstPart)
print(" * 10 в степени ")
mSecondPart = int(input())
print(mSecondPart)

m2 = mFirstPart * math.pow(10,mSecondPart)

print("Введите расстояние до планеты: ")
rFirstPart = float(input())
print("Расстояние = ", rFirstPart)
print(" * 10 в степени ")
rSecondPart = int(input())
print(rSecondPart)

R = rFirstPart * math.pow(10,rSecondPart)

#выше я постарался реализовать такой ввод, чтобы можно было ограничиться общепринятой СИ и при этом не вводить КУЧУЧИСЕЛ

real = sila(m2, R)

#юзаем функцию наконец

stpn = 0

while real>10:
    real/=10
    stpn+=1

#чудо выше – результат того, что на число было неприятно смотреть

real = round(real, 2)

#тоже самое, но про знаки после запятой

print (name, " с Землёй имеют силу притяжения ", real,"* 10 ^",stpn," Ньютонов друг к другу.")