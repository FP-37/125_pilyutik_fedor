import pymorphy2
import locale
import time
import requests
import lxml
from bs4 import BeautifulSoup

locale.setlocale(locale.LC_ALL, 'ru_RU.UTF-8')
morph = pymorphy2.MorphAnalyzer()

def season_events(number_of_month,year):

    user_date = time.strptime(str(number_of_month) + ', ' + str(year), '%m, %Y')
    usual_date_month = time.strftime('%B', user_date)
    usual_date_year = time.strftime('%Y', user_date)

    personal_url = [f"https://ru.wikipedia.org/w/index.php?search=события+and+%22{usual_date_month}+{usual_date_year}%22&title=Служебная:Поиск&profile=advanced&fulltext=1&ns0=1"]
    personal_url = "".join(personal_url)
    url_info = BeautifulSoup(requests.get(personal_url).text, "lxml")
    zagolovok = url_info.findAll('div', "mw-search-result-heading")
    padezh_month = morph.parse(usual_date_month)[0]
    print("Вы родились в ", usual_date_year, "году, в месяце ", padezh_month.inflect({'loct'}).word, "!!!\nВот какие события происходили в этом месяце:")
    i=0
    while i < 5:
        print(zagolovok[i].text)
        i += 1

print("Введите номер месяца рождения:")
user_month = int(input())
print("Введите год рождения:")
user_year = int(input())

if (user_month > 12) or (user_month < 1) or (user_year > 2023):
    print("Ошибка! Некорректная дата.")
    exit(0)

season_events(user_month,user_year)