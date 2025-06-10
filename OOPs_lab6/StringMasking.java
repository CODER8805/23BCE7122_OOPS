public class StringMasking {

    // Hide last 4 digits of a phone number
    public static String hideLast4Digits(String phone) {
        int len = phone.length();
        if (len <= 4) return "*".repeat(len);
        return phone.substring(0, len - 4) + "****";
    }

    // Hide middle part of an email
    public static String hideEmailMiddle(String email) {
        int atIndex = email.indexOf('@');
        if (atIndex <= 2) return email; // not enough characters to mask
        String firstChar = email.substring(0, 1);
        String lastChar = email.substring(atIndex - 1, atIndex);
        return firstChar + "*****" + lastChar + email.substring(atIndex);
    }

    // Replace all characters except first and last
    public static String maskExceptFirstAndLast(String str) {
        if (str.length() <= 2) return str;
        return str.charAt(0) + "*".repeat(str.length() - 2) + str.charAt(str.length() - 1);
    }

    public static void main(String[] args) {
        String phone = "9876543210";
        String email = "amazinguser@gmail.com";
        String word = "privacy";

        System.out.println("Original Phone: " + phone);
        System.out.println("Masked Phone: " + hideLast4Digits(phone));

        System.out.println("\nOriginal Email: " + email);
        System.out.println("Masked Email: " + hideEmailMiddle(email));

        System.out.println("\nOriginal Word: " + word);
        System.out.println("Masked Word: " + maskExceptFirstAndLast(word));
    }
}
