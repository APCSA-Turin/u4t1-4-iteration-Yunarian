public class Words {
    // private contructor
    private Words() {}

    public static boolean doesContain(String section, String word) {
        return word.contains(section);
    }

    public static void printReverse(String word) {
        for (int i = word.length(); i > 0; i--) {
            System.out.print(word.substring(i - 1, i) + " ");
        }
        System.out.println();
    }
}
