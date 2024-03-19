package ro.ulbs.paradigme.lab3.forms.ro.ulbs.paradigme.lab3.util;

public class RandomStringGenerator {
    private final int length;

    public RandomStringGenerator(int length) {
        this.length = length;
    }

    public String generateRandomString() {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder result = new StringBuilder();
        int random =  (int)(Math.random());

        for (int i = 0; i < length; i++) {
            int index = random.(characters.length());
            result.append(characters.charAt(index));
        }

        return result.toString();
    }
}