package CheckPassword;
import java.util.Scanner;

public class main {

    private static int checkUpperCase(String x) {
        return (int) x.chars().filter(Character::isUpperCase).count();
    }

    private static int checkLowerCase(String x) {
        return (int) x.chars().filter(Character::isLowerCase).count();
    }

    private static int checkDigit(String x) {
        return (int) x.chars().filter(Character::isDigit).count();
    }

    private static int checkSpecial(String x) {
        return (int) x.chars().filter(ch -> !Character.isLetterOrDigit(ch)).count();
    }

    private static double check(String x) {
        int upperCase = checkUpperCase(x);
        int lowerCase = checkLowerCase(x);
        int Digit = checkDigit(x);
        int special = checkSpecial(x);
        double score = (x.length() * 4) + (upperCase * 2) + (lowerCase * 2) + (Digit * 3) + (special * 5);
        double percentage = (score * 100) / 100;
        if (percentage > 100) {
            percentage = 100;
        }
        return percentage;
    }

    public void checking() {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Your Password: ");
        String password = x.next();
        double percent = check(password);
        System.out.println("Your Percentage Password: " + percent + "%");
    }
}

