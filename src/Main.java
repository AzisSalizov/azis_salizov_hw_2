public class Main {
    public static void main(String[] args) {
        System.out.println(permission(15, -20));
        System.out.println(permission(45, 30));
        System.out.println(permission(25, 24));
        System.out.println(permission(40, 30));
        System.out.println(permission(20, 36));
    }

    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return "Можно идти гулять";
        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            return "Можно идти гулять";
        } else if (age > 45 && (temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}