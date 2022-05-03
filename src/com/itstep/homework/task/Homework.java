package com.itstep.homework.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * homework 01
 *
 * @author kaa
 * @version 1.1
 * @see "https://metanit.com/java/tutorial/2.1.php"
 * @see "https://metanit.com/java/tutorial/2.2.php"
 * @see "https://metanit.com/java/tutorial/2.3.php"
 * @see "https://metanit.com/java/tutorial/2.5.php"
 * @see "https://metanit.com/java/tutorial/2.9.php"
 * @see "https://metanit.com/java/tutorial/2.12.php"
 * @see "https://metanit.com/java/tutorial/2.14.php"
 * @see "https://metanit.com/java/tutorial/2.15.php"
 */
public class Homework {

    /**
     * создай переменные (примитивы) всех известных тебе типов данных + строка (одна)<br/>
     * инициализируй их значениями по умолчанию<br/>
     * выведи каждую
     */
    public void task1() {
        // твой код: start

        byte var1 = 1;
        short var2 = 1212;
        int var3 = 255522;
        long var4 = 65465464654665L;
        float var5 = 0.3f;
        double var6 = 8.2345;
        char var7 = 'k';
        char var8 = 45;
        boolean var9 = true;

        System.out.println("byte = " + var1);
        System.out.println("short = " + var2);
        System.out.println("int = " + var3);
        System.out.println("long = " + var4);
        System.out.println("float = " + var5);
        System.out.println("double = " + var6);
        System.out.println("char = " + var7);
        System.out.println("char = " + var8);
        System.out.println("boolean = " + var9);

        // твой код: end
    }

    /**
     * у тебя есть две переменные<br/>
     * инициализируй их и выведи результат их сложения
     */
    public void task2() {
        // твой код: start
        int a = 5;
        int b = 6;
        a = a + b;
        System.out.println(a);
        // твой код: end
    }

    /**
     * тоже самое, только другим способом
     */
    public void task3() {
        // твой код: start
        int a = 5;
        int b = 6;
        a += b;
        System.out.println(a);
        // твой код: end
    }

    /**
     * у тебя есть две переменные<br/>
     * тебе нужно их поделить между собой
     */
    public void task4() {
        int a = 11;
        int b = 3;
        // твой код: start
        double c = (double) a / b;
        System.out.println(c);
        // твой код: end
    }

    /**
     * тоже самое, только другим способом
     */
    public void task5() {
        // твой код: start
        double a = 11;
        double b = 3;
        a /= b;
        System.out.println(a);
        // твой код: end
    }

    /**
     * тоже самое, только другим способом
     */
    public void task6() {
        String a = "11";
        String b = "3";
        // твой код: start
        Double c = Double.parseDouble(a) / Double.parseDouble(b);
        System.out.println(c);
        // твой код: end
    }

    /**
     * у тебя есть переменная хранящая число<br/>
     * преврати его в строку
     */
    public void task7() {
        // твой код: start
        int a = 7;
        String b = Integer.toString(a);
        System.out.println(b);
        // твой код: end
    }

    /**
     * тоже самое, только другим способом
     */
    public void task8() {
        // твой код: start
        int a = 7;
        String b = String.valueOf(a);
        System.out.println(b);
        // твой код: end
    }

    /**
     * тоже самое, только другим способом
     */
    public void task9() {
        // твой код: start
        Integer a = 7;
        String str = a.toString(a);
        System.out.println(str);
        // твой код: end
    }

    /**
     * у тебя есть переменная, которая хранит в себе номер дня месяца<br/>
     * уточни, это четный день или нет
     */
    public void task10() {
        int dayOfMonth = LocalDate.now().getDayOfMonth();
        // твой код: start

        String b = dayOfMonth % 2 == 0 ? "Четное" : "Нечетное";
        System.out.println(b);

        // твой код: end
    }

    /**
     * у тебя есть две переменные<br/>
     * нужно выяснить которая из них содержит большее число<br/>
     * не используй чужие классы
     */
    public void task11() {
        // твой код: start
        int a = 9;
        int b = 7;
        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println("равны");
        }
        // твой код: end
    }

    /**
     * тоже самое, но только с тремя переменными<br/>
     * не используй чужие классы
     */
    public void task12() {
        // твой код: start
        int a = 12;
        int b = 6;
        int c = 2;
        int d = (a > b && a > c) ? a : ((b > a && b > c) ? b : c);
        System.out.println(d);
        // твой код: end
    }

    /**
     * у тебя есть две переменные<br/>
     * нужно выяснить которая из них содержит меньшее число<br/>
     * не используй чужие классы
     */
    public void task13() {
        // твой код: start
        int a = 3;
        int b = 5;
        if (a < b) {
            System.out.println(a);
        } else if (a > b) {
            System.out.println(b);
        } else {
            System.out.println("равны");
        }
        // твой код: end
    }

    /**
     * тоже самое, но только с тремя переменными<br/>
     * не используй чужие классы
     */
    public void task14() {
        // твой код: start
        int a = 12;
        int b = 6;
        int c = 2;
        int d = (a < b && a < c) ? a : ((b < a && b < c) ? b : c);
        System.out.println(d);
        // твой код: end
    }

    /**
     * черт! этот маньяк бешенный! он хочет убить всех людей!<br/>
     * нужно срочно ему помешать одним росчерком пера!
     */
    public void task15() {
        boolean killAllPeople = true;
        // твой код: start
        if (!killAllPeople) {
            System.out.println("I'm Robot! I wanna kill al people!");
        } else {
            System.out.println("I'm Robot, I love all people!");
        }
        // твой код: end
    }

    /**
     * тоже самое, но с использованием оболочки boolean
     */
    public void task16() {
        boolean killAllPeople = true;
        // твой код: start
        if (killAllPeople = false) { //Boolean.FALSE.equals(killAllPeople)??
            System.out.println("I'm Robot! I wanna kill al people!");
        } else {
            System.out.println("I'm Robot, I love all people!");
        }
       // твой код: end
    }

    /**
     * у тебя есть переменная которая содержит номер дня недели<br/>
     * выясни, что это за день
     */
    public void task17() {
        int dayOfWeek = LocalDate.now().getDayOfWeek().getValue();
        // твой код: start
        if (dayOfWeek == 1) {
            System.out.println("Понедельник");
        } else if (dayOfWeek == 2) {
            System.out.println("Вторник");
        } else if (dayOfWeek == 3) {
            System.out.println("Среда");
        } else if (dayOfWeek == 4) {
            System.out.println("Четверг");
        } else if (dayOfWeek == 5) {
            System.out.println("Пятница");
        } else if (dayOfWeek == 6) {
            System.out.println("Суббота");
        } else if (dayOfWeek == 7) {
            System.out.println("Воскресенье");
        }
        // твой код: end
    }

    /**
     * тоже самое, только другим способом
     */
    public void task18() {
        int dayOfWeek = LocalDate.now().getDayOfWeek().getValue();
        // твой код: start
        switch (dayOfWeek) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
        }
        // твой код: end
    }

    /**
     * тоже самое, только другим способом
     */
    public void task19() {
        int dayOfWeek = LocalDate.now().getDayOfWeek().getValue();
        // твой код: start
        String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        System.out.println(week[dayOfWeek - 1]);
        // твой код: end
    }

    /**
     * тоже самое, только другим способом
     */
    public void task20() {
        int dayOfWeek = LocalDate.now().getDayOfWeek().getValue();
        // твой код: start
        System.out.println(new SimpleDateFormat("EEEE").format(new Date()));
        // твой код: end
    }

    /**
     * выясни, это будний день или выходной
     */
    public void task21() {
        int dayOfWeek = LocalDate.now().getDayOfWeek().getValue();
        // твой код: start
        if (dayOfWeek >= 1 && dayOfWeek <= 5) {
            System.out.println("Будний");
        } else {
            System.out.println("Выходной");
        }
    }
    // твой код: end


    /**
     * тоже самое, только другим способом
     */
    public void task22() {
        int dayOfWeek = LocalDate.now().getDayOfWeek().getValue();
        // твой код: start
        switch (dayOfWeek) {
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Будний");
        }
        // твой код: end
    }

    /**
     * тоже самое, только другим способом
     */
    public void task23() {
        int dayOfWeek = LocalDate.now().getDayOfWeek().getValue();
        // твой код: start
        boolean day = dayOfWeek >= 1 && dayOfWeek <= 5;
        if (day) {
            System.out.println("Будний");
        } else {
            System.out.println("Выходной");
        }
        // твой код: end
    }

    /**
     * тоже самое, только другим способом
     */
    public void task24() {
        int dayOfWeek = LocalDate.now().getDayOfWeek().getValue();
        // твой код: start
        String day = dayOfWeek >= 1 && dayOfWeek <= 5 ? "Будний" : "Выходной";
        System.out.println(day);
        // твой код: end
    }

    /**
     * у тебя есть два числа: 1 и 2, ты должен получить число 12 не используя другие числа
     */
    public void task25() {
        Integer a = 1;
        int b = 2;
        // твой код: start
        String c = a.toString() + b;
        System.out.println(c);
        // твой код: end
    }

    /**
     * у тебя есть два числа: 1 и 2, ты должен получить число 1221 не используя другие числа<br/>
     * идеальное решение - одна строка кода буквально в 24 символа)
     */
    public void task26() {
        Integer a = 1;
        int b = 2;
        // твой код: start
        System.out.println(a.toString() + b + b + a);
        // твой код: end
    }

    /**
     * этот метод запрашивает от тебя любой тип данных<br/>
     * но вводишь ты строку и получаешь строку (переменная line)<br/>
     * попробуй правильно преобразовать эти строки к следующим типам:<br/>
     * integer<br/>
     * double<br/>
     * boolean<br/>
     * char<br/>
     * ответ можешь оставить на любом типе, тут важно накопление твоего опыта и понимания сути
     */
    public void task27() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введи любой тип данных: ");
            String line = bufferedReader.readLine();
            // твой код: start
           int i = Integer.parseInt(line);
           double d = Double.parseDouble(line);
           boolean b = Boolean.parseBoolean(line);
           char ch = line.charAt(0);
            System.out.print("int: " + i +"\n" + "double: " + d + "\n" + "boolean: " + b + "\n"
                    + "char : " + ch );
           // твой код: end
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * на сообразительность, задание со звездочкой, вернее со звездищей<br/>
     * есть две строки, нужно сложить их таким образом, чтобы получить число 195
     */
    public void task28() {
        String a = "a";
        String b = "b";
        // твой код: start
        String c = String.valueOf(a.charAt(0) + b.charAt(0));
        System.out.println(c);

        // твой код: end
    }
}
