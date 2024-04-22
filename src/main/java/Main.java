import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String string1 = generateRandomString();
        System.out.println(" First String: " + string1);

        String string2 = generateRandomString();
        System.out.println(" Second string: " + string2);

        Set<Character> uniqueCharacters = new HashSet<>();
        for (int i = 0; i < string1.length(); i++) {
            uniqueCharacters.add(string1.charAt(i));
        }
        for (int i =0; i< string2.length(); i++) {
            uniqueCharacters.add(string2.charAt(i));
        }
        System.out.println( " Unique Characters: " + uniqueCharacters);
    }

    private static String generateRandomString() {
        Random random = new Random();
        int stringLength = random.nextInt(20,50);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringLength; i++) {
            char c = (char) (random.nextInt(8) + 'a');
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}

/*
Задание 2:
Взять две строки случайных символов ,длина каждой строки от 20 до 50 символов.
Вывести в консоль список символов которые встречаются только один раз на все две строки.
 */