public class Main {
    public static void main(String[] args) {
        // Задача 1:
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Операционная система не распознана.");
        }

        // Задача 2:
        int clientDeviceYear = 2014;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        } else {
            System.out.println("Операционная система не распознана.");
        }

        // Задача 3:
        int year = 2024;
        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println("Год должен быть больше 1584.");
        }

        // Задача 4:
        int deliveryDistance = 95;
        int deliveryTime = 1;

        if (deliveryDistance > 20) {
            deliveryTime++;
        }
        if (deliveryDistance > 60) {
            deliveryTime++;
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставка свыше 100 км невозможна.");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }

        // Задача 5:
        int monthNumber = 12;
        if (monthNumber >= 1 && monthNumber <= 12) {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону зима.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону весна.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону лето.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Месяц " + monthNumber + " принадлежит к сезону осень.");
                    break;
            }
        } else {
            System.out.println("Номер месяца должен быть от 1 до 12.");
        }
    }
}