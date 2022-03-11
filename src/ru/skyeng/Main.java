package ru.skyeng;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year,yearIsLeap);
    }
private static boolean isLeap(int year) {
        return year %4==0&& year % 100 != 0 || year% 400 ==0;
}
private static void printIsLeapYearResult(int year,boolean yearIsLeap) {
        if (yearIsLeap){
            System.out.println(year + " Высокосный");
        }else {
            System.out.println(year + " Не является высокосным");
        }
}
public static void printRecommendAppLicationVersion(int clientOS,int devicerYear) {
    boolean deviceIsOld = isDeviceOld(devicerYear);
    System.out.print(" Установите ");
    if (deviceIsOld) {
        System.out.print(" lite ");
    }
    System.out.print(" Версия для ");
    if (clientOS == 0) {
        System.out.println(" ios ");
    }else {
        System.out.println(" Android ");
    }
}
private static boolean isDeviceOld(int deviceYear){
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
}
public static void  calculateAndPrintDeliveryDays(int deliveryDistance) {
        int result =1;
    if (deliveryDistance > 20) {
        result++;
    }
    if (deliveryDistance> 60){
        result++;
    }
    System.out.println(" Количество дней доставки " + result);
}
public static void findAndPrintDupLicatesIfAny(String text){
    char[] letters = text.toCharArray();
    char prevChar = Character.MAX_VALUE;
    for (char letter: letters){
        if (letter== prevChar){
            System.out.println(" Найден дубль по мимволу " + letter);
            return;
        }
        prevChar = letter;
    }
    System.out.println(" Дубль не найдено ");
}
public static void reverseArray(int[]arr) {
        int head = 0;
        int tail = arr.length - 1;
    while (head < tail) {
        int temp = arr[tail];
        arr[head++] = arr[tail];
        arr[tail--] = temp;
    }
}
    public static void main(String[] args) {
        int year = 2015;
        printIsLeapYear(year);
        System.out.println();

        printRecommendAppLicationVersion(0,2016);
        System.out.println();

calculateAndPrintDeliveryDays(45);
        System.out.println();

        findAndPrintDupLicatesIfAny("abccddefgghiijjkk");
        System.out.println();

        int[] arr = new int[]{3, 2, 1, 6, 5};
        reverseArray(arr);
        System.out.println("reversed array: " + Arrays.toString(arr));
        System.out.println();
    }
}

