import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class WordCounter {

    private final List<String> listOfFruits = Collections.synchronizedList(new ArrayList<>());


    public void addWord(String word) {
        listOfFruits.add(word);
    }


    public int getWordCount(String word) throws FruitException {
        int count = 0;
        for (String listOfFruit : listOfFruits) {
            if (listOfFruit.contains(word)) {
                count++;
            }
        }
        if (count == 0) {
            throw new FruitException(word);
        } else return count;
    }


}
