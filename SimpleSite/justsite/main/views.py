from django.shortcuts import render, redirect
from .models import Task
from .forms import TaskForm


def index(request):
    tasks = Task.objects.all()
    return render(request, 'main/index.html', {'title': 'Главная страница рынка!!!', 'tasks': tasks})


def about_us(request):
    return render(request, 'main/about_us.html')


def add_fruits(request):
    error = ''
    if request.method == 'POST':
        form = TaskForm(request.POST)
        if form.is_valid():
            form.save()
            return redirect('home')
        else:
            error = 'Форма заполнена неверно'
    form = TaskForm()
    context = {'form': form,
               'error': error}
    return render(request, 'main/add_fruits.html', context)