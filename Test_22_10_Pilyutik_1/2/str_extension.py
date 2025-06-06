# Проверяет, является ли строка палиндромом
def is_palindrome(data):
    return data == data[::-1]

# Удаляет симметричные совпадающие символы
def remove_symmetric(data):
    result = ""
    cnt = 0
    for i in range(len(data) // 2):
        if data[i] != data[len(data) - i - 1]:
            result = result[:cnt] + data[i] + data[len(data) - i - 1] + result[cnt:]
            cnt += 1
    return result


# Удаляет все вхождения символа в строку
def remove_all(data, symbol):
    return data.replace(symbol, "")

# Меняет местами два символа в заданных позициях
def swap_symbols(data, first, second):
    first, second = sorted([first, second])
    return data[:first] + data[second] + data[first:second] + data[first] + data[second:]

# Меняет регистр символов
def change_register(data):
    res = ''
    for s in data:
        if s.isupper():
            res += s.lower()
        else:
            res += s.upper()
    return res