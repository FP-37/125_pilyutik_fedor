import kivy

from kivy.app import App
from kivy.lang import Builder
from kivy.uix.boxlayout import BoxLayout
from kivy.uix.anchorlayout import AnchorLayout
from kivy.uix.gridlayout import GridLayout
from kivy.properties import StringProperty
from kivy.uix.button import Button
from kivy.uix.textinput import TextInput

Field = """
Structure:
    orientation: "vertical"
    size_hint: (.95,.95)
    pos_hint: {"center_x": .5, "center_y": .5}
    NumQ:
        size_hint: (1,.2)
        rows: 2
        Button:
            text: "1 knopka"
            bold: True
            background_color: '#00FFCE'
            size_hint: (1,0.5)
        Button:
            text: "2 knopka"
            bold: True
            background_color: '#00FFCE'
            size_hint: (1,0.5)
        Button:
            text: "3 knopka"
            bold: True
            background_color: '#00FFCE'
            size_hint: (1,0.5)
        Button:
            text: "4 knopka"
            bold: True
            background_color: '#00FFCE'
            size_hint: (1,0.5)
    Ask:
        orientation: "vertical"
        size_hint: (1,.5)
        Label:
            font_size: "15sp"
            multiline: True
            text_size: self.width*0.98, None
            size_hint_x: 1.0
            size_hint_y: None
            height: self.texture_size[1] + 15
            text: root.data_label
        TextInput:
            id: Inp
            multiline: False
            padding_y: (5,5)
            size_hint: (1,0.5)
        Button:
            text: "Ничего!!!"
            bold: True
            background_color: '#00FFCE'
            size_hint: (1,0.5)
            on_press: root.callback1()
        Button:
            text: "Отдыхаем..."
            bold: True
            background_color: '#00FFCE'
            size_hint: (1,0.5)
            on_press: root.callback2()
        Button:
            text: "Работаем???"
            bold: True
            background_color: '#00FFCE'
            size_hint: (1,0.5)
            on_press: root.callback3()
    
"""

class NumQ(GridLayout):
    pass

class Ask(BoxLayout):
    pass

class Structure(BoxLayout):
    data_label = StringProperty("Что делаем?")
    def callback1(self):
        print("Ничего!!!")
    def callback2(self):
        print("Отдыхаем...")
    def callback3(self):
        print("Работаем???")

class Question(BoxLayout):
    pass

class MyApp(App):
    running = True
    def build(self):
        return Builder.load_string(Field)
    def on_stop(self):
        self.running = False

if __name__ == "__main__":
    MyApp().run()