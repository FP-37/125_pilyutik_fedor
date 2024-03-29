import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println(FirstWayOfHW());
        // Actions();
        /* Закомментил функцию Actions к заданию 4 - можно раскомментить её и посмотреть на работу.
        Условие задачи предполагает вывод в консоль всех значений, поэтому удобнее прописать это всё внутри самой функции. */
    }

    /* 1. Напишите программу hello world. Используйте операцию конкатенации для записи двух разных строк “Hello ” и “world” */
    public static String FirstWayOfHW() {
        String x = "Hello " + "world!"; // Конкатенация - объединение нескольких строковых значений в одно
        return x;
    }

    /* 2. Выполните задание 1, храня строки в переменных и используя их при печати. */
    public static String SecondWayOfHW() {
        String privet = "Hello ";
        String mir = "world!"; // Объявили две переменные и присвоили им значения
        String x = privet + mir;
        return x;
    }

    /* 3. Создать две переменные типа int и типа double. Реализовать в печати (?) простой калькулятор с простыми операциями:*,/,+,-,%. */
    public static double calc() {
        double res = 0; //Переменная, которая будет возвращать результат. В случае отсутсвия результата возвращает 0.
        Scanner conscalc = new Scanner(System.in);
        System.out.println("Вы хотите рассчитать целые числа или вещественные?\n1. Целые\n2. Вещественные");
        byte ChOfType = conscalc.nextByte(); //Используем байт, чтобы сэкономить на памяти хотя бы в паре переменных
        System.out.println("Введите 2 числа, над которыми хотите совершить бинарную операцию:");
        if (ChOfType == 1) {
            int x = conscalc.nextInt();
            System.out.println("Первое число записано");
            int y = conscalc.nextInt();
            System.out.println("Второе число записано.\nВыберите нужное действие:\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление\n5. Рассчёт остатка");
            byte ChOfAction = conscalc.nextByte();
            switch (ChOfAction) {
                case 1:
                    res = x+y;
                    break;
                case 2:
                    res = x-y;
                    break;
                case 3:
                    res = x*y;
                    break;
                case 4:
                    res = x/y;
                    break;
                case 5:
                    res = x%y;
                    break;
            }
        }
        else if (ChOfType == 2) {
            double a = conscalc.nextDouble();
            System.out.println("Первое число записано");
            double b = conscalc.nextDouble();
            System.out.println("Второе число записано.\nВыберите нужное действие:\n1. Сложение\n2. Вычитание\n3. Умножение\n4. Деление\n5. Рассчёт остатка");
            byte ChOfAction = conscalc.nextByte();
            switch (ChOfAction) {
                case 1:
                    res = a+b;
                    break;
                case 2:
                    res = a-b;
                    break;
                case 3:
                    res = a*b;
                    break;
                case 4:
                    res = a/b;
                    break;
                case 5:
                    res = a%b;
                    break;
            } // Можно было более компактно, но решил опираться на условие задачи, и использовать каждую переменную
        }// К тому же мне понравилась реализация за счёт корректной разницы между подсчётом деления для целых и вещественных чисел
        return res;
    }

    /* 4. Создать переменную и сделать печать составных операций +=, -=, /=, *=. Использовать инкремент и декремент (--),(++). */
    public static void Actions() {
        int brandnewX = 0;
        System.out.println(brandnewX += 8); // brandnewX == 8
        System.out.println(brandnewX -= 2); // brandnewX == 6
        System.out.println(brandnewX /= 3); // brandnewX == 2
        System.out.println(brandnewX *= 7); // brandnewX == 14
        System.out.println(brandnewX);
        System.out.println(brandnewX++); // Добавилась единица, которая не отобразится
        System.out.println(brandnewX--); // Единица из прошлой строки добавилась + мы прописали вычитание единицы, которое не отобразится
        System.out.println(++brandnewX); // Вывод не изменился, потому что добавилась единица из этой строки и вычлась единица, прописанная в прошлой строке
        System.out.println(--brandnewX); // Вывод предполагает мгновенное вычитание единицы из переменной
    }

    /* 5. Создать программу, которая вычислит выражение: 25/13+12*(29-45+13/5) и выведет результат на экран. */
    public static double Expression() {
        double x = 25.0/13.0+12*(29-45+13.0/5.0); // Использовали числа с плавающей точкой, чтобы получить корректный результат деления
        return x;
    }

    /* 6. Сократите запись выражения из задания 4 используя переменные для хранения простых вычислений, например x=25/13, y=29-45.*/
    public static String brandnewActions(){
        int X = 0;
        int Y = X+8;
        int Z = Y-2;
        int A = Z/3;
        int B = A*7;
        return (""+X+" "+Y+" "+Z+" "+A+" "+B);
    }


    /* 7. В переменной n хранится двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n. */
    public static int SumOfDigits(int n) {
        int sum = n/10;
        sum += n % 10;
        return sum; // Прогнали число по разрядам
    }
}