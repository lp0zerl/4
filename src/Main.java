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
        String osType = clientOS == 0 ? "iOS" : clientOS == 1 ? "Android" : "неизвестная ОС";

        if (osType.equals("неизвестная ОС")) {
            System.out.println("Операционная система не распознана.");
        } else {
            String versionType = clientDeviceYear < 2015 ? "облегченную" : "";
            System.out.printf("Установите %sверсию приложения для %s по ссылке.%n",
                    versionType, osType);
        }

        // Задача 3:
        int year = 2024;
        if (year <= 1584) {
            System.out.println("Год должен быть больше 1584.");
        } else {
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            System.out.println(year + " год " + (isLeap ? "является" : "не является") + " високосным.");
        }

        // Задача 4:
        int deliveryDistance = 95;
        if (deliveryDistance > 100) {
            System.out.println("Доставка свыше 100 км невозможна.");
        } else {
            int deliveryTime = 1;
            if (deliveryDistance > 60) deliveryTime += 2;
            else if (deliveryDistance > 20) deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        }

        // Задача 5:
        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Месяц " + monthNumber + " принадлежит к сезону зима.");
            case 3, 4, 5 -> System.out.println("Месяц " + monthNumber + " принадлежит к сезону весна.");
            case 6, 7, 8 -> System.out.println("Месяц " + monthNumber + " принадлежит к сезону лето.");
            case 9, 10, 11 -> System.out.println("Месяц " + monthNumber + " принадлежит к сезону осень.");
            default -> System.out.println("Номер месяца должен быть от 1 до 12.");
        }
    }
}