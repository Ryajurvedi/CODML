
// Java Program to Print all unique words
// Using nested loops

public class GFG {

    static void printUniqueWords(String str) {

        int count;

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {

                    count++;

                    words[j] = "";
                }
            }

            if (count == 1 && words[i] != "")
                System.out.println("unique words are " + words[i]);
            else
                System.out.println("duplicatewords are " + words[i]);
        }
    }

    public static void main(String[] args) throws Exception {

        java.util.Scanner sc;

        sc = new java.util.Scanner(new java.io.File("C:/Users/Asus/Documents/java/Bsud.txt"));

        while (sc.hasNext()) {
            String str = sc.next();
            printUniqueWords(str);

        }

    }

}
