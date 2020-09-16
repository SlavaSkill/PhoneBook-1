import java.util.Scanner;
import java.util.Arrays;

public class PhoneBook {

    public static void main(String[] args) {

        System.out.println("Введите ФИО");
        Scanner scanName = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanName.nextLine();
            isCorrectName = checkName(name);
        if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
        } else {
            System.out.println(formatName(name));
        }
        }
        System.out.println("Введите 11-ти значный номер телефона");
        Scanner scanPhone = new Scanner (System.in);
        boolean isCorrectPhone = false;
        while (!isCorrectPhone) {
            String phoneNumber = scanPhone.nextLine();
            isCorrectPhone = checkPhoneNumber(phoneNumber);
        if (!isCorrectPhone) {
                System.out.println("Введите корректный номер телефона!");
        } else {
            System.out.println(formatPhoneNumber(phoneNumber));
        }
        }
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        String clean = phoneNumber.replaceAll("[^0-9]", "");
        return clean.length() == 11;
    }

    public static boolean checkName(String name) {
        String[] words = name.trim().split(" ");
        return words.length == 3;
    }

    public static String formatName(String name) {
        String[] words = name.trim().split(" ");
        String result = "";
        for (String str : words) {
            char firstChar = str.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";
            } else {
                result += str + " ";
            }
        }
        return result;
    }

    public static String formatPhoneNumber(String number) {
        String clean = number.replaceAll("[^0-9]", "");
        String result = "+371" + " " + clean.charAt(3) + " " +
                clean.substring(4, 7) + " " + clean.substring(7, 9) + " " + clean.substring(9);

        return result;
    }

    public static void add(String[][] book, String name, String number) {

   //add logic

    }

    public static void list(String[][] book) {
        //print phone book
    }
}
