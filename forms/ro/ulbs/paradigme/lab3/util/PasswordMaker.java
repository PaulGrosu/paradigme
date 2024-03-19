package ro.ulbs.paradigme.lab3.forms.ro.ulbs.paradigme.lab3.util;

public class PasswordMaker {
    private static final int MAGIC_NUMBER = 10;
    private static final String MAGIC_STRING = new RandomStringGenerator(20).generateRandomString();

    private final String name;

    public PasswordMaker(String name) {
        this.name = name;
    }

    public String getPassword() {
        // Generate a random string of length MAGIC_NUMBER
        String randomString = new RandomStringGenerator(MAGIC_NUMBER).generateRandomString();

        // Create an alphabet from 10 characters randomly selected from MAGIC_STRING
        StringBuilder alphabet = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            int index =new random().nextInt(MAGIC_STRING.length());
            alphabet.append(MAGIC_STRING.charAt(index));
        }

        // Convert the length of 'name' to a string
        String nameLengthStr = String.valueOf(name.length());

        // Generate a random integer in the range [0, 50]
        int randomInt = new random().nextInt(51);

        // Construct the password by concatenating the strings
        return randomString + alphabet + nameLengthStr + randomInt;
    }

    public static void main(String[] args) {
        String personName = "Alice";
        PasswordMaker passwordMaker = new PasswordMaker(personName);
        String password = passwordMaker.getPassword();
        System.out.println("Generated password for " + personName + ": " + password);
    }
}