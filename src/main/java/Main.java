import java.util.ArrayList;
import java.util.List;

public class Main {
    public static class Pair {
        String letter;
        int amount;

        public Pair(String letter, int amount) {
            this.letter = letter;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {

    }

    public static String compress(String s) {
        List<Pair> pairs = new ArrayList<>();

        // keep track of previous letter
        String prev = s.substring(0, 1);

        // add it to list of pairs
        pairs.add(new Pair(s.substring(0, 1), 1));

        // loop through array and check for runs of the same character, go updating counts
        // or creating new pairs
        for (int i = 1; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals(prev))
                pairs.get(pairs.size() - 1).amount++;
            else {
                pairs.add(new Pair(s.substring(i, i + 1), 1));
                prev = s.substring(i, i + 1);
            }
        }

        String result = "";
        for (Pair p : pairs)
            result += p.letter + p.amount;

        if (result.length() < s.length())
            return result;
        else return s;
    }
}
