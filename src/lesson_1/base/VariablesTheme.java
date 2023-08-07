public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера\n");

        byte numberOfCores = 4;
        short memory = 16384;
        int ssdCapacity = 122880;
        long hddCapacity = 1048576;
        float cpuFrequency = 3.5F;
        double overclockedCpuFrequency = 4.5;
        char cpuIndex = 'K';
        boolean hasGpu = true;

        System.out.println(numberOfCores + " Количество ядер");
        System.out.println(memory + " Объем памяти в мегабайтах");
        System.out.println(ssdCapacity + " Емкость SSD");
        System.out.println(hddCapacity + " Емкость HDD");
        System.out.println(cpuFrequency + " Частота процессора");
        System.out.println(overclockedCpuFrequency + " Частота процессора под разгоном");
        System.out.println(cpuIndex + " Индекс процессора");
        System.out.println(hasGpu + " Наличие видеокарты\n\n");

        System.out.println("2. Расчет стоимости товара со скидкой\n");

        int penPrice = 100;
        int bookPrice = 200;
        double discount = 0.11;

        int totalPrice = penPrice + bookPrice;
        double discountAmount = totalPrice * discount;
        double discountPrice = totalPrice - discountAmount;

        System.out.println("Общая стоимость товаров без скидки: " + totalPrice);
        System.out.println("Сумма скидки: " + discountAmount);
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice +"\n\n");

        System.out.println("3. Вывод слова JAVA\n");

        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a\n\n");

        System.out.println("4. Вывод min и max значений целых числовых типов\n");

        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;

        System.out.println("byte\n" + maxByte + "\n" + ++maxByte + "\n" + --maxByte + "\n");
        System.out.println("short\n" + maxShort + "\n" + ++maxShort + "\n" + --maxShort + "\n");
         System.out.println("int\n" + maxInt + "\n" + ++maxInt + "\n" + --maxInt + "\n");
         System.out.println("long\n" + maxLong + "\n" + ++maxLong + "\n" + --maxLong + "\n\n");

        System.out.println("5.Перестановка значений переменных\n");

        int x = 2;
        int y = 5;

        System.out.println("С помощью третьей переменной\n");
        System.out.println("Исходные значения переменных " + x + "и" + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Новые значения переменных " + x + "и" + y + "\n");

        System.out.println("С помощью арифметических операций\n");
        System.out.println("Исходные значения переменных " + x + "и" + y);
        x += y;
        y = x - y;
        x -= y;
        System.out.println("Новые значения переменных " + x + "и" + y + "\n");

        System.out.println("С помощью побитовой операции ^\n");
        System.out.println("Исходные значения переменных " + x + "и" + y);
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println("Новые значения переменных " + x + "и" + y + "\n");

        System.out.println("6. Вывод символов и их кодов\n");

        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';

        System.out.println((int) dollar + " " + dollar);
        System.out.println((int) asterisk + " " + asterisk);
        System.out.println((int) atSign + " " + atSign);
        System.out.println((int) verticalBar + " " + verticalBar);
        System.out.println((int) tilde + " " + tilde + "\n\n");

        System.out.println("7. Вывод в консоль ASCII-арт Дюка\n");

        char slash = '/';
        char backslash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';

        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backslash
                            + underscore + underscore + backslash + "\n\n");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа\n");

        int num = 123;

        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;
        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;

        System.out.println("Число " + num + " содержит:");
        System.out.println("сотен - " + hundreds);
        System.out.println("десятков - " + tens);
        System.out.println("единиц - " + ones);
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = " + product + "\n\n");

        System.out.println("9. Вывод времени\n");

        int time = 86399;

        int hours = time / 3600;
        int minutes = time / 60 % 60;
        int seconds = time % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
    