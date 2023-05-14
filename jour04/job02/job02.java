package jour04.job02;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import java.util.Scanner;

public class job02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la longueur de la chaîne de caractères aléatoire :");
        int length = scanner.nextInt();
        scanner.close();

        long startTime = System.currentTimeMillis();

        String randomString = generateRandomString(length);
        writeToFile("output.txt", randomString);

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Le temps d'exécution global est : " + duration + " millisecondes");
    }

    public static String generateRandomString(int length) {
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    public static void writeToFile(String filename, String content) {
        try {
            OutputStream outputStream = new FileOutputStream(new File(filename));
            outputStream.write(content.getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

