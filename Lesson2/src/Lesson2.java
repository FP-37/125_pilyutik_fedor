import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(IceCream());
        //Between();
        //Even();
    }

    /* 1.	В переменной n хранится вещественное число с ненулевой дробной частью.
    Создайте программу, которая округляет число n до ближайшего целого и выводящую результат на экран.
    Например n=23,5 после округления число станет равным 24. */
    public static int NoFloat() {
        Scanner typed = new Scanner(System.in);
        int result;
        double n = typed.nextDouble();
        if ((n>0) && (n/(int)n!=1)) { // Условная конструкция, которая позволяет избегать неточностей при вводе целых или отрицательных чисел
            if ((n /((int)n + 0.5)) >= 1) { // Условная конструкция if else проверяет, к какому целому числу ближе переменная n
                result = (int)n + 1;
            } else {
                result = (int)n;
            }
        }
        else if (n/(int)n==1) {
            result = (int)n;
        }
        else if (n<0) {
            if ((n /((int)n - 0.5)) >= 1) {
                result = (int)n - 1;
            } else {
                result = (int)n;
            }
        }
        else {
            result = 0;
        }
        return result;
    }

    /* 2. На биржевых торгах за 1 фунт стерлингов давали $1.487, за франк — $0.172. за немецкую марку — $0.584, а за японскую йену — $0.00955.
    Напишите программу, которая запрашивает денежную сумму в долларах, а затем выводит эквивалентные суммы в других валютах.
    Например: Введите количество долларов 12,4 Вы получите 8,634 фунта, 21,232 немецкой марки, 1298,429 йен. */
    public static String Conv() {
        double FS = 1.487;
        double F = 0.172;
        double M = 0.584;
        double Y = 0.00955;
        Scanner typed = new Scanner(System.in);
        double D = typed.nextDouble();
        FS = D/FS;
        F = D/F;
        M = D/M;
        Y = D/Y; // Использование тех же переменных нехорошо с точки зрения логики, но экономит память
        return (FS + " Фунтов Стерлингов, " + F + " Франков, " + M + " Марок, " + Y + " Йен"); // Можно использовать printf или DecimalFormat().format(), если захотим уменьшить количество знаков после запятой
    }

    /* 3.	Температуру, измеренную в градусах по Цельсию, можно перевести в градусы по Фаренгейту путем умножения на 9/5 и сложения с числом 32.
    Напишите программу, запрашивающую температуру в градусах по Цельсию и отображающую ее эквивалент по Фаренгейту.
    Например: Введите градусы по цельсию 5 - эквивалент по Фаренгейту 41 */
    public static String Degrees() {
        Scanner typed = new Scanner(System.in); // Сканнеры для каждой функции новые из соображения самостоятельности функций, но можно реализовать передачу из main
        double degC = typed.nextDouble();
        double degF = degC*(9.0/5.0)+32;
        return (degF + " градусов фаренгейта");
    }

    /* 4. Напишите программу, рассчитывающую сумму денег,
    которые вы получите при вложении начальной суммы с фиксированной процентной ставкой дохода через определенное количество лет.
    Пользователь должен вводить с клавиатуры начальный вклад, число лет и процентную ставку.
    Примером результата работы программы может быть следующий:
    Введите начальный вклад: 3000.
    Введите число лет: 10
    Введите процентную ставку: 5.5
    через 10 лет вы получите 5124.43 доллара.
    В конце первого года вы получите 3 000 + (3 000*0.055) = 3165 долларов.
    В конце следующего года вы получите 3 165 + (3 165*0.055) = 3339.08 долларов.
    Подобные вычисления удобно производить с помощью цикла for. */
    public static String deposit() {
        Scanner typed = new Scanner(System.in);
        System.out.println("Введите начальный вклад:");
        double sum = typed.nextInt();
        System.out.println("Введите количество лет:");
        int years = typed.nextInt();
        System.out.println("Введите процентную ставку:");
        double percent = typed.nextDouble();
        for (int i = 0; i<years; i++) {
            sum *= 1+(percent/100.0);
            if (i == 0) {
                System.out.println("В конце первого года на вашем балансе будет " + sum + " долларов.");
            }
            else if (i<(years-1)) {
                System.out.println("В конце следующего года на вашем балансе будет " + sum + " долларов.");
            }
        }
        return ("Через " + years + "года (лет) вы получите: " + sum + " долларов.");
    }

    /* 5. Напишите программу, которая печатает все четные числа от 25 до 62. Использовать цикл for. */
    public static void Even() {
        for (int x = 25; x <= 62; x++) {
            if (x%2 == 0) {
                System.out.println(x);
            }
        }
    }

    /* 6.	Напишите программу, которая проверяет четность введенного числа и печатает “ДА” если оно четно и “НЕТ” если нечетно.
    Например: 2
    ДА */
    public static String YesNo() {
        Scanner typed = new Scanner(System.in);
        int x = typed.nextInt();
        String yeah;
        if (x%2==0) {
            yeah = "ДА";
        }
        else {
            yeah = "НЕТ";
        }
        return yeah;
    }

    /* 7. Билет на одну поездку в метро стоит 15 рублей,
    билет на 5 поездок стоит 70 рублей,
    билет на 10 поездок стоит 125 рублей,
    билет на 20 поездок стоит 230 рублей,
    билет на 60 поездок стоит 440 рублей.
    Пассажир планирует совершить n поездок.
    Определите, сколько билетов каждого вида он должен приобрести, чтобы суммарное количество оплаченных поездок было не меньше n,
    а общая стоимость приобретенных билетов – минимальна. Выведите пять целых чисел, равные необходимому количеству билетов на 1, на 5, на 10, на 20, на 60 поездок.
    Если для какого-то данного n существует несколько способов приобретения билетов одинаковой стоимости,
    необходимо вывести ту комбинацию билетов, которая дает большее число поездок. */
    public static String Tickets() {
        int oneT = 0, fiveT = 0, tenT = 0, twentyT = 0, sixtyT = 0;
        int cost1T = 15, cost5T = 70, cost10T = 125, cost20T = 230, cost60T = 440;
        Scanner typed = new Scanner(System.in);
        System.out.println("Введите необходимое количество билетов:");
        int n = typed.nextInt();
        if (n/60>=1) {
            sixtyT = n/60;
            n -= sixtyT*60;
        }
        if (n/20>=1) {
            twentyT = n/20;
            n -= twentyT*20;
        }
        if (n/10>=1) {
            tenT = n/10;
            n -= tenT*10;
        }
        if (n/5>=1) {
            fiveT = n/5;
            n -= fiveT*5;
        }
        if (n/1>=1) {
            oneT = n/1;
            n -= oneT;
        }
        int sum = oneT*15 + fiveT*70 + tenT*125 + twentyT*230 + sixtyT*440;
        return ("Нужно " + sixtyT + " билет(-а/-ов) на 60 поездок, " + twentyT + " билет(-а/-ов) на 20, " + tenT + " билет(-а/-ов) на 10, " + fiveT + " билет(-а/-ов) на 5, " + oneT + " билет(-а/-ов) на 1.\nСуммарно нужно будет заплатить " + sum + " рублей.");
    }
    /* 8. Решить в целых числах уравнение ax + b = 0.
    Вводятся целое число a и число b.
    Необходимо вывести все решения, если их число конечно,
    “NO” (без кавычек), если решений нет,
    и “INF” (без кавычек), если решений бесконечно много. */
    public static String Equation() {
        Scanner typed = new Scanner(System.in);
        System.out.println("Введите коэфициент a:");
        double a = typed.nextDouble(); // Используя int, получим некорректное решение
        System.out.println("Введите коэфициент b:");
        double b = typed.nextDouble();
        String x;
        if (a == 0) {
            if (b == 0) {
                x = "INF"; // Единственный случай бесконечного количества решений - 0x+0=0
            }
            else {
                x = "NO"; // Решения отсутствуют при a==0 и a!=0 одновременно
            }
        }
        else {
            double X = (-b)/a;
            x = "" + X; // Конвертируем в строку, чтобы любой из возможных вариантов выводился из функции через return x
        }
        return x;
    }
    /* 9.	Создайте программу, вычисляющую факториал натурального числа n,
    которое пользователь вводит с клавиатуры.  Например: 3. Факториал равен 6. */
    public static String Fc() {
        Scanner typed = new Scanner(System.in);
        long factorial = 1; // Я выбрал long, чтобы корректных факториалов было побольше
        int n = typed.nextInt();
        for (int i = 1; i<=n; i++) {
            factorial *= i;
        }
        return ("Факториал равен " + factorial);
    }

    /* 10. Для введённого пользователем с клавиатуры натурального числа
    посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).
    Например: 113.
    Сумма чисел равна 5. */
    public static int Sum() {
        Scanner typed = new Scanner(System.in);
        int numb = typed.nextInt();
        int sum = 0, digit;
        while (numb!=0) { // Пока не "выжмем" каждую цифру из числа - цикл не заканчивается
                digit = numb % 10; // Забираем разряд единиц
                numb /= 10; // После того, как забрали - уменьшаем число на один разряд
                sum += digit; // Добавляем забранную цифру в счётчик суммы
        }
        return sum;
    }

    /*11.	В программу вводятся два числа a и b.
    Напечатать все четные числа между a и b включительно.
    Например: a=2 b=5; Программа напечатает 2 и 4. */
    public static void Between() {
        Scanner typed = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = typed.nextInt();
        System.out.println("Введите второе число:");
        int b = typed.nextInt();
        if (a >= b) {
            System.out.println("Число b должно быть больше числа a."); // Обрабатываем возможную ошибку. Можно реализовать и вариант с вариативностью размера переменных, сравнивая a и b, и выбирая подходящий вариант.
            System.exit(0);
        }
        System.out.println("Чётные числа между введёнными:");
        while (a <= b) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }

    /* 12. В программу вводятся два числа a и b. напечатать наибольшее число. */
    public static int Comparison() {
        Scanner typed = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = typed.nextInt();
        System.out.println("Введите второе число:");
        int b = typed.nextInt();
        System.out.print("Большим числом является ");
        if (a>=b) {
            return a;
        }
        else {
            return b;
        }
    }

    /* 13.	В программу вводится номер года n.
    Требуется определить, является ли данный год високосным.
    (год является високосным, если его номер кратен 4, но не кратен 100, а также если он кратен 400.)
    Напечатать YES если високосный или NO если не високосный.
    Например: 2007 NO 2000 YES. */
    public static String LeapYear() {
        Scanner typed = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = typed.nextInt();
        if (year % 4 == 0) { // Кратно ли 4-м?
            if ((year % 100 == 0) && (year % 400 != 0)) { // Кратно ли ста? Также проверяем исключение для четырёхсот
                return ("NO");
            }
            else {
                return ("YES");
            }
        }
        else {
            return ("NO");
        }
    }
    /* 14.	В математике функция sign(x) (знак числа) определена так:
    sign(x) = 1,   если x > 0,
    sign(x) = -1, если x < 0,
    sign(x) = 0,   если x = 0.
    Для данного числа x выведите значение sign(x). */
    public static int Sign() {
        Scanner typed = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = typed.nextInt();
        if (x>0) {
            return 1;
        }
        else if (x == 0) {
            return 0;
        }
        else {
            return -1;
        }
    }
    /* 15.	Товар стоит a руб. b коп. За него заплатили c руб. d коп. Сколько сдачи требуется получить?
    В программу вводятся значения a, b, c, d. Выводятся e и f число рублей и копеек. */
    public static String Change() {
        int a, b, c, d, e, f;
        Scanner typed = new Scanner(System.in);
        System.out.println("Введите стоимость товара (рубли):");
        a = typed.nextInt();
        System.out.println("Введите стоимость товара (копейки):");
        b = typed.nextInt();
        if (b>=100) {
            a = b/100;
            b %= 100;
        }
        System.out.println("Введите отданную покупателем сумму (рубли):");
        c = typed.nextInt();
        System.out.println("Введите отданную покупателем сумму (копейки):");
        d = typed.nextInt();
        if (d>=100) {
            c = d/100;
            d %= 100;
        }
        if (a<0 || b<0 || c<0 || d<0) {
            System.out.println("Некорректно");
            System.exit(0);
        }
        if (c<a) {
            System.out.println("Недоплатил, получается");
            System.exit(0);
        }
        else if ((c==a) && (d<b)) {
            System.out.println("Занесёте попозже");
            System.exit(0);
        }
        e = c-a;
        f = d-b;
        if (f<0) {
            e -= 1;
            f = 100+f;
        }
        return ("Сдача: " + e + " рублей, " + f + " копеек.");
    }
    /* 16. В кафе мороженое продают по три шарика и по пять шариков.
    Можно ли купить ровно k шариков мороженого? В программу вводится количество шариков k.
    Выдается YES если можно и NO если нельзя. */
    public static String IceCream() {
        Scanner typed = new Scanner(System.in);
        System.out.println("Введите количество шариков:");
        int balls = typed.nextInt();
        if (balls % 3 == 0 || balls % 5 == 0 || balls % 5 == 3) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
}