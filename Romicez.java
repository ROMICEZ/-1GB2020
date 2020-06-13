public class Romicez {
    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {
        Romicez();
        System.out.println("a * (b + (c / d)) = " + roMic(5, 7, 9, 2));
        System.out.println(roMac(11,5));
        roMec(50);
        System.out.println(roMxr(-58));
        roMgx("Макс");
        roMuu(2020);
    }


    // 2. Создать переменные всех пройденных типов данных и инициализировать их значения;
    static void Romicez() {
        System.out.println("\nПервое задание.");
        byte one = 111;
        int number = 7;
        long l = 500L;
        float fl = 7.2f;
        double dbl = 9.2D;
        char c = 'c';
        boolean yes = true;
        boolean no = false;
        System.out.println("Второе задание.");
        System.out.println("Значение bate = " + one);
        System.out.println("Значение int = " + number);
        System.out.println("Значение long = " + l);
        System.out.println("Значение float = " + fl);
        System.out.println("Значение double = " + dbl);
        System.out.println("Значение char = " + c);
        System.out.println("Значеине boolean = " + yes);
        System.out.println("Значеине boolean = " + no);
    }

    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,;
    // где a, b, c, d – аргументы этого метода, имеющие тип float.;
    public static float roMic(float a, float b, float c, float d) {
        System.out.println("\nТретие задание.");
        return a * (b + (c / d));
    }

    // 4. Написать метод, принимающий на вход два целых числа и проверяющий,;
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.;
    static boolean roMac(int a, int b) {
        System.out.println("\nЧетвертое задание.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    // 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,;
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.;
    static void roMec(int x) {
        System.out.println("\nПятое задание.");
        if (x >= 0 )System.out.println("Число " + x  +"\n" + "положительное");
        else System.out.println("Число" + x + "отрицательное");
    }

    // 6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,;
    // если число отрицательное.;
    static boolean roMxr(int a) {
        System.out.println("\nШестое задание.");
        if (a < 0) return true;
        return false;
    }

    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.;
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».;
    static void roMgx(String name) {
        System.out.println("\nСедьмое задание.");
        System.out.println("Привет," + name + "!");
    }

    // 8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    static void roMuu(int year) {
        System.out.println("\nВосьмое задание.");
        if ((year % 400 == 0) && (year % 100 == 0) || (year % 4 ==0)) System.out.println(year + "високосный");
        else System.out.println(year + "не високосный");

    }
}
