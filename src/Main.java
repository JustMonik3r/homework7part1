import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void printSeparator() {
        System.out.println("====================");
    }

    public static int deliverStuff (int deliveryDistance) {
        int deliveryTime;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
            System.out.println("На доставку потребуется дней: " + deliveryTime);
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("На доставку потребуется дней: " + deliveryTime);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("На доставку потребуется дней: " + deliveryTime);
        }
        if (deliveryDistance > 100) {
            System.out.println("На данное расстояние доставки нет");
        }
        return deliveryDistance;
    }

    public static int checkPhoneOS (int phoneOS){
        int clientDeviceYear = LocalDate.now().getYear();;
        int stableDeviceYear = 2015;
        if (phoneOS == 0) {
            if (clientDeviceYear < stableDeviceYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите стабильную версию приложения для iOS по ссылке");
            }
        } else if (phoneOS == 1){
            if (clientDeviceYear < stableDeviceYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите стабильную версию приложения для Android по ссылке");
            }
        }
        return phoneOS;
    }

    public static int isItLeapYear (int year) {
        if (((year % 4 == 0) && (year % 100 !=0)) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        return year;
    }
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 1904;
        isItLeapYear(year);
        printSeparator();

        System.out.println("Задача 2");
        int phoneOS = 1;
        checkPhoneOS(phoneOS);
        printSeparator();

        System.out.println("Задача 3");
        int deliveryDistance = 44;
        deliverStuff(deliveryDistance);
        printSeparator();
    }
}