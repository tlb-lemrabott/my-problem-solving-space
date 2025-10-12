//Given a string determine if each character is letter or digit.


public class CharCheck {
    public static void main(String[] args) {
        String input = "Abc123$%";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                System.out.println(c + " is a letter");
            } else if (Character.isDigit(c)) {
                System.out.println(c + " is a digit");
            } else {
                System.out.println(c + " is neither letter nor digit");
            }
        }
    }
}