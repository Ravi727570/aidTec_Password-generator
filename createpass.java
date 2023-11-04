import java.security.SecureRandom;
import java.util.Random;

public class createpass{
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
    private static final Random RANDOM = new SecureRandom();

    public static void main(String[] args) {
        int length = 10;
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            password.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
        }

        System.out.println("Generated Password: " + password.toString());
    }
}
