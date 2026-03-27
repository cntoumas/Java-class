import java.util.Scanner;

class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int wordCount = 0;
        boolean isWord = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                isWord = true;
            } else if (isWord) {
                wordCount++;
                isWord = false;
            }
        }
        if (isWord) {
            wordCount++;
        }
        System.out.println("Number of words: " + wordCount);
    }
}