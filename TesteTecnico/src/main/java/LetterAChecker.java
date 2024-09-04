import java.util.Scanner;

public class LetterAChecker {
    public static int countAOccurrences(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        int count = countAOccurrences(input);
        System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + count + " vezes.");

        scanner.close();
    }
}