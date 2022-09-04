package ru.galiia.zainagtdinova.lesson1;

public class DataTypes {

    public final int dtr = 434543;

    public static void main(String[] args) {
        // комментарий

        System.out.println("Hello!"); // вывести текст Hello!
        System.out.println((4343+5)/434);

        /*
         * Многострочный комментарий
         */

        /**
         * Комментарий для документации
         */

        /* Как создать переменную примитив
         *  ТИП_ПЕРЕМЕННОЙ НАЗВАНИЕ_ПЕРЕМЕННОЙ = ЗНАЧЕНИЕ;
         */
        int name = 4;

        // Примитивные типы данных - 8 штук - всегда с маленькой буквы!

        // Числовые

        // Целые byte, short, int, long
        byte a = (byte) -129; // диапазон от -128 до 127
        short b = Short.MIN_VALUE; // от -32768 до 32767
        int c = 2 + 23445 * 543543534; // от -2147483648 до 2147483647
        long d = 3142332432432L;

        int sh = 0XFFF; // шестнадцатиричный формат числа

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(sh);

        // Дробные float, double
        float f = 111.4343f; // число с плавающей точкой
        double d1 = 0.45444;

        char x = 'S'; // Символьный
        System.out.println(x);

        // Логический
        boolean isGreen = true; // true/false

        // Ссылочный тип - всегда с большой буквы!
        String str = "Строка"; // текстовый

    }
}
