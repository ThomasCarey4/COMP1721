package ex;

public class Ex4_CheckPassword {
    public static boolean longEnough(String password) {
        return password.length() >= 12;
    }

    public static boolean atLeastTwoDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
        }
        return count >= 2;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Ex4_CheckPassword <password>");
            System.exit(1);
        }
        if (longEnough(args[0]) && atLeastTwoDigits(args[0])) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }
}
