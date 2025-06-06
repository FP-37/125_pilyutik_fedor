"""
Запустите скрипт 'create.sql' с помощью mysql.
   Создайте скрипт на python, который подключается к созданной БД и выводит на экран следующие данные:
     - из таблицы Student маскимальное значени среднего балла всех студентов
     (посмотрите структуру таблицы, чтобы найти название нужного атрибута)
     - число групп, в которых учатся студенты, средний балл которых выше среднего.
   В качестве ответа скрипт выводит два числа по одному в строке.
   Данные для подключения находятся в файле 'config.json' Отредактируйте его под себя для тестировния.
   Рекомендуется запускаться от root пользователя, чтобы не получить ошибок. Либо сконфигурируйте БД для работы с вашим
   пользователем с помощью GRANT PRIVILEGES. Перед отправкой данный файл можно удалить.
"""

import json
import mysql.connector

# Чтение конфигурации из файла config.json
with open('config.json') as config_file:
    config = json.load(config_file)

# Подключение к базе данных MySQL
connection = mysql.connector.connect(
    host=config['host'],
    user=config['user'],
    password=config['password'],
    database=config['database']
)
cursor = connection.cursor()

# Выполнение запроса для получения максимального среднего балла
cursor.execute("SELECT MAX(mean_points) AS max_mean_points FROM Student")
result = cursor.fetchone()
max_mean_points = result[0]

# Выполнение запроса для подсчета числа групп с средним баллом выше среднего
cursor.execute("SELECT COUNT(DISTINCT StudentsGroup.id) AS num_groups_above_average FROM Student INNER JOIN StudentsGroup ON Student.StudentsGroup_id = StudentsGroup.id WHERE Student.mean_points > %s", (max_mean_points,))
result = cursor.fetchone()
num_groups_above_average = result[0]

# Вывод результатов
print(max_mean_points)
print(num_groups_above_average)

# Закрытие соединения с базой данных
cursor.close()
connection.close()