import java.util.Scanner;

public class URI1272 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character after the integer

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim(); // Remove leading and trailing spaces
            String[] words = line.split("\\s+"); // Split the line into words

            // Iterate through the words and append the first character of each to the hidden message
            StringBuilder hiddenMessage = new StringBuilder();
            for (String word : words) {
                hiddenMessage.append(word.charAt(0));
            }

            System.out.println(hiddenMessage);
        }

        sc.close();
    }
}
