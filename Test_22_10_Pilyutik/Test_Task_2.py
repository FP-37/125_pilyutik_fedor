"""
Из файла data.csv считать данные и посчитать основные статистические харакеристики столбцов A, B, C (среднее, медиана
максимум, минимум, стандартное отклонение). В качестве ответа вывести на экран наибольшее из значений для каждой
характеристики по 1 в строке соответственно.
"""
import pandas as pd
import numpy as np

# Чтение данных из файла data.csv
df = pd.read_csv('data.csv')

# Вычисление основных статистических характеристик для столбцов A, B, C
mean_A = df['A'].mean()
median_A = df['A'].median()
max_A = df['A'].max()
min_A = df['A'].min()
std_A = df['A'].std()

mean_B = df['B'].mean()
median_B = df['B'].median()
max_B = df['B'].max()
min_B = df['B'].min()
std_B = df['B'].std()

mean_C = df['C'].mean()
median_C = df['C'].median()
max_C = df['C'].max()
min_C = df['C'].min()
std_C = df['C'].std()

# Вывод наибольшего значения для каждой характеристики
print("Наибольшее среднее значение: ", max(mean_A, mean_B, mean_C))
print("Наибольшее медианное значение: ", max(median_A, median_B, median_C))
print("Наибольшее максимальное значение: ", max(max_A, max_B, max_C))
print("Наибольшее минимальное значение: ", min(min_A, min_B, min_C))
print("Наибольшее стандартное отклонение: ", max(std_A, std_B, std_C))