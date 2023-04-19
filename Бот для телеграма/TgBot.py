import telebot
from telebot import types

bot = telebot.TeleBot('placeforyourtoken')

days = ['Понедельник','Вторник','Среда','Четверг','Пятница','Суббота','Воскресенье']
week = []
time = ['17:00','18:00','19:00','20:00','21:00','22:00','23:00']
hours = []
info = []

@bot.message_handler(commands = ['start'])
def start(message):
    mrkup = types.InlineKeyboardMarkup()
    mrkupsubject = types.ReplyKeyboardMarkup(resize_keyboard=True)
    mypagebtn = types.InlineKeyboardButton(text="Я на service", url='https://ya.ru')
    mrkup.add(mypagebtn)
    bot.send_message(message.from_user.id, "Добро пожаловать в форму записи на мои занятия!\nМеня зовут Name!, и я буду рад помочь в освоении Subject!!!:)\nМою страницу tutor вы можете прсмотреть по ссылке ниже.",reply_markup = mrkup)
    algbtn = types.KeyboardButton(text="Math")
    geombtn = types.KeyboardButton(text="ForeignLanguage")
    ogebtn = types.KeyboardButton(text="Chemistry")
    mrkupsubject.add(algbtn,geombtn,ogebtn)
    bot.send_message(message.from_user.id,"Пожалуйста, выберите Subject!, по которому Вам необходимо проконсультироваться.",reply_markup=mrkupsubject)

@bot.message_handler(content_types=['text'])
def get_text_messages(message):

    mrkupday = types.ReplyKeyboardMarkup(resize_keyboard=True)
    for one in days:
        weekdaybtn = types.KeyboardButton(text=f"{one}")
        week.append(weekdaybtn)

    mrkuptime = types.ReplyKeyboardMarkup(resize_keyboard=True)
    for hour in time:
        hourbtn = types.KeyboardButton(text=f"{hour}")
        hours.append(hourbtn)

    if message.text == "Math" or message.text == "ForeignLanguage" or message.text == "Chemistry":
        info.append(message.text)
        mrkupday.add(week[0],week[1],week[2],week[3],week[4],week[5],week[6])
        bot.send_message(message.from_user.id,"Пожалуйста, выберите удобный день для занятий.",reply_markup=mrkupday)
        print(message.text)
    elif message.text in days:
        info.append(message.text)
        mrkuptime.add(hours[0],hours[1],hours[2],hours[3],hours[4],hours[5],hours[6])
        bot.send_message(message.from_user.id,"Пожалуйста, выберите удобное время в указанный день.",reply_markup=mrkuptime)
        print(message.text)
    elif message.text in time:
        info.append(str(message.text))
        bot.send_message(message.from_user.id,"Спасибо! Теперь укажите ваше имя и контакты в следующем сообщении.")
        print(message.text)
    else:
        info.append(message.text)
        bot.send_message(message.from_user.id,"Отлично, вы записаны!\nОднако это тестовая форма, чтобы показать возможности построения взаимодействия с ботом. Запись будет в новом и действительно работающем боте;)")
        print(message.text)

bot.polling(none_stop=True, interval=0)
