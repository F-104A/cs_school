import java.util.*;

public class WordChecker {
    private ArrayList<String> wordList;

    public WordChecker(ArrayList<String> wordList) {
        this.wordList = wordList;
    }

    public boolean isWordChain() {
        for (int i = 0; i < wordList.size() - 1; i++) {
            if (wordList.get(i + 1).indexOf(wordList.get(i)) == -1) {
                return false;
            }
        }

        return true;
    }

    public ArrayList<String> createList(String target) {
        ArrayList<String> result = new ArrayList<String>();

        for (String s : wordList) {
            if (s.substring(0, target.length()).equals(target)) {
                result.add(s.substring(target.length() - 1));
            }
        }

        return result;
    }
}
