package pro.sky;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // task 1
        byte clientOS = 0;
        boolean IsClientIOS = clientOS == 0;
        boolean IsClientAndroidOS = clientOS == 1;
        if (IsClientIOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (IsClientAndroidOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // task 2
        clientOS = 1;
        IsClientIOS = clientOS == 0;
        IsClientAndroidOS = clientOS == 1;
        int clientDeviceYear = 2015;
        boolean IsClientDeviceNew = clientDeviceYear >= 2015;
        boolean isClientDeviceOld = clientDeviceYear < 2015;
        if (IsClientIOS && isClientDeviceOld) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (IsClientIOS && IsClientDeviceNew){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (IsClientAndroidOS && isClientDeviceOld) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (IsClientAndroidOS && IsClientDeviceNew) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // task 3
        int year = 2022;
        int every4;
        int every100;
        int every400;
        every4 = year % 4;
        every100 = year % 100;
        every400 = year % 400;
        boolean isEvery4EqualZeroTrue = every4 == 0;
        boolean isEvery4EqualZeroFalse = every4 !=0;
        boolean isEvery100EqualZeroTrue = every100 == 0;
        boolean isEvery100EqualZeroFalse = every100 != 0;
        boolean isEvery400EqualZeroTrue = every400 == 0;
        boolean isEvery400EqualZeroFalse = every400 != 0;
        boolean yearLess100 = year < 100;
        boolean yearMore100 = year >= 100;
        if (isEvery4EqualZeroFalse) {
            System.out.println(year + " год не является високосным");
        }
        if (isEvery4EqualZeroTrue && yearLess100) {
            System.out.println(year + " год является високосным");
        }
        if (isEvery4EqualZeroTrue && yearMore100 && isEvery100EqualZeroFalse) {
            System.out.println(year + " год является високосным");
        }
        if (isEvery100EqualZeroTrue && yearMore100 && isEvery400EqualZeroFalse) {
            System.out.println(year + " год не является високосным");
        }
        if (isEvery400EqualZeroTrue && yearMore100) {
            System.out.println(year + " год является високосным");
        }
        //task 4
        int deliveryDistance = 95;
        float deliveryDays;
        if (deliveryDistance < 20) {
            deliveryDays = 1;
            System.out.println("Доставка банковской карты займет " + deliveryDays + " день");
        }
        if (deliveryDistance >= 20) {
            deliveryDays = (deliveryDistance + 20)/ 40;
            deliveryDays +=1;
            System.out.println("Доставка банковской карты займет " + deliveryDays + " дней");
        }
        //Task 5
        int month = 4;
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}