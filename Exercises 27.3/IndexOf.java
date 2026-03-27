public class IndexOf {
    public static void main(String[] args) {
        String phrase = "The quick brown fox jumps over the lazy dog.";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        System.out.println("a b c d e f g h i j");
        System.out.println("=========================");
        for (int i = 0; i < 10; i++) {
            char letter = alphabet.charAt(i);
            int index = phrase.indexOf(letter);
            System.out.print(index);
            if (i < 9) System.out.print(" ");
        }
        System.out.println("\n");
        
        System.out.println("k l m n o p q r s t");
        System.out.println("===========================");
        for (int i = 10; i < 20; i++) {
            char letter = alphabet.charAt(i);
            int index = phrase.indexOf(letter);
            System.out.print(index);
            if (i < 19) System.out.print(" ");
        }
        System.out.println("\n");
        
        // Third row: u-z
        System.out.println("u v w x y z");
        System.out.println("================");
        for (int i = 20; i < 26; i++) {
            char letter = alphabet.charAt(i);
            int index = phrase.indexOf(letter);
            System.out.print(index);
            if (i < 25) System.out.print(" ");
        }
        System.out.println();
    }
}