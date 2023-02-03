import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

    }

    private static void checkPhone(int productionYear, int clientOS) {
        if (clientOS <= 1 && productionYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } if (productionYear > 2014) {
            System.out.println("Для пользователей телефонов " + productionYear +
                    " года выпуска и позже необходимо установить версии приложений для Android и IOS по ссылке");
        }
    }

    private static int Days(int kilometer) {
        if (kilometer >= 0 && kilometer <= 20) {
            return 1;
        } else if (kilometer > 20 && kilometer <= 60) {
            return 2;
        } else if (kilometer > 60 || kilometer <= 100) {
            return 3;
        } else {
            return - 1;
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        checkYear(2022);
    }

    public static void task2() {
        System.out.println("Задача 2");
        checkPhone(2016, 1);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int kilometer = 110;
        int days = Days(kilometer);
        if (days == -1){
            System.out.println("Доставка невозможна на растояние " + kilometer + " киллометров");
        } else {
            System.out.println("Время доставки " + days + " дн.");
        }
    }
}





