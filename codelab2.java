import java.util.Scanner;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class codelab2 {
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@webmail.umm.ac.id")) {
            throw new InvalidEmailException("Alamat email tidak valid. Harus mengandung '@webmail.umm.ac.id'.");
        } else {
            System.out.println("Alamat email valid.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan alamat email: ");
        String email = scanner.nextLine();

        try {
            validateEmail(email);
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}