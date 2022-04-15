public class Main {

    public static void main(String[] args) throws FruitException {
        WordCounter wc = new WordCounter();
        wc.addWord("apple");
        wc.addWord("banana");
        wc.addWord("apple");


        System.out.println(wc.getWordCount("apple"));
        System.out.println(wc.getWordCount("banana"));
        System.out.println(wc.getWordCount("cucumber"));

        WordCounter secondWc = new WordCounter();
        System.out.println(secondWc.getWordCount("apple"));

    }
}
